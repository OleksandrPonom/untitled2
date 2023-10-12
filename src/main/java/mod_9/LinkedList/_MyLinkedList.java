package mod_9.LinkedList;

public class _MyLinkedList {
	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<>();

		System.out.println("list.size(first) = " + list.size());

		list.add("First");System.out.println("list.size(add) = " + list.size());

		list.add("Second");
		System.out.println("list.size(add) = " + list.size());

		System.out.println("list.get(0) = " + list.get(0));
		System.out.println("list.get(1) = " + list.get(1));
		list.remove(0);
		System.out.println("list.get(remove) = " + list.get(0));

		list.clear();
		System.out.println("list NEW SIZE= " + list.size());
		System.out.println("list = " + list.get(0));
	}
}
