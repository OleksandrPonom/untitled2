package mod_9.Stack;

public class Node<T>{
	private T value;
	private Node<T> next;

	public T getValue(int index) {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
