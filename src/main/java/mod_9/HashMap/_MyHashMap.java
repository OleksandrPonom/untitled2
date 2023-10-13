package mod_9.HashMap;

public class _MyHashMap {
	public static void main(String[] args) {
		MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
		myHashMap.put(0, "This first element");
		myHashMap.put(1, "This second element");
		myHashMap.put(2, "This third element");
		myHashMap.put(3, "This fourth element");
		myHashMap.put(4, "This fifth element");

		System.out.println("myHashMap = " + myHashMap.size());

		System.out.println("myHashMap.get(0) = " + myHashMap.get(4));

		myHashMap.remove(1);
		System.out.println("myHashMap.get after remove = " + myHashMap.get(1));

		myHashMap.clear();
		System.out.println("myHashMap = " + myHashMap.size());

	}
}
