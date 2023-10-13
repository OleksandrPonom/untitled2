package mod_9.LinkedList;

public class MyLinkedList<T> {
	private Node<T> head;

	public void add(T value) {
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

	public T remove(int index) {
		if (head == null) {
			throw new IndexOutOfBoundsException("No items in list");
		}

		Node<T> search = head;
		for (int i = 0; i < index; i++) {
			search = search.getNext();
		}
		if(index == size() - 1){
			throw new IndexOutOfBoundsException("Element(s) in LIST " + (size() - 1));
		}
		head = head.getNext();
		return null;
	}

	 	public T clear() {
		while (head != null) {
			head = null;
		}
		return null;
	}

}
