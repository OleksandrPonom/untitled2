package mod_9.LinkedList;

public class _MyLinkedList {
	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<>();

		System.out.println("list.size(first) = " + list.size());

		list.add("Alfa");
		System.out.println("list.size(add) = " + list.size());

		list.add("Beta");
		System.out.println("list.size(add) = " + list.size());

		System.out.println("list.get(0) = " + list.get(0));
		System.out.println("list.get(1) = " + list.get(1));
		list.remove(1);
		System.out.println("list.get(1) = " + list.get(1));

		list.clear();
		System.out.println("list NEW SIZE= " + list.size());
		System.out.println("list = " + list.get(0));
	}
}
