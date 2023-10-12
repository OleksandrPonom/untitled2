package mod_9.Stack;


/*
*
    pop() повертає перший елемент стеку та видаляє його з колекції
* */


public class MyStack<T> {
	private Node<T> head;




	public void push(T value){
		Node<T> node = new Node<>();
		node.setValue(value);

		if (head == null) {
			head = node;
		} else {
			Node<T> element = head;
			while (element.getNext() != null) {
				element = element.getNext();
			}
			element.setNext(node);
		}
	}


	public int size() {
		if (head == null) {
			return 0;
		}

		int count = 1;
		Node<T> element = head;
		while (element.getNext() != null) {
			element = element.getNext();
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

	public T peek() {
		int el = size() - 1;
		if (head == null) {
			throw new IndexOutOfBoundsException("No items in list");
		}
		return head.getValue(el);
	}

	public T pop(){
		if (head == null) {
			throw new IndexOutOfBoundsException("No items in list");
		}
		int el = size() - 1;
		System.out.println("pop = " + head.getValue(el));
		head = head.getNext();
		return head.getValue(el);
	}



	public T remove(int index){
		int el = size();
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

		return search.getValue(index);
	}
}
