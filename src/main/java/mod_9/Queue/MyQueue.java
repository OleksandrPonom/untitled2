package mod_9.Queue;

public class MyQueue<T> {
	private Node<T> head;

	public void add(T value){
		Node<T> node = new Node<>();
		node.setValue(value);

		if (head == null) {
			head = node;
		} else {
			Node<T> last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(node);
		}
	}

	public int size() {
		if (head == null) {
			return 0;
		}

		int count = 1;
		Node<T> last = head;
		while (last.getNext() != null) {
			last = last.getNext();
			count++;
		}
		return count;
	}

	public T clear() {
		while (head != null) {
			head = null;
		}
		return null;
	}

	public T peek(){
		if (head == null) {
			throw new IndexOutOfBoundsException("No items in list");
		}

		Node<T> search = head;
		return search.getValue();
	}

	public T poll(){
		if (head == null) {
			throw new IndexOutOfBoundsException("No items in list");
		}

		Node<T> search = head;
		head = search.getNext();
		return search.getValue();
	}

	public T get(int index) {
		if (head == null) {
			throw new IndexOutOfBoundsException("No items in list");
		}

		Node<T> search = head;
		for (int i = 0; i < index; i++) {
			search = search.getNext();

			if (search == null) {
				throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
			}
		}

		return search.getValue();
	}
}
