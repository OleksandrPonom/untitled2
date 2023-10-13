package mod_9.HashMap;

public class MyHashMap<K, V> {
	private Node<K, V> head;

	public void put(K key, V value){
	Node<K, V> node = new Node<>();
	node.setKey(key);
	node.setValue(value);

		if (head == null) {
			head = node;
		} else {
			Node<K, V> last = head;
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
		Node<K, V> last = head;
		while (last.getNext() != null) {
			last = last.getNext();
			count++;
		}
		return count;
	}

	public V get(K key) {
		if (head == null) {
			throw new IndexOutOfBoundsException("No items in list");
		}
		Node<K, V> search = head;
		int index = getBucketIndex(key);
		for (int i = 0; i < index; i++) {
			search = search.getNext();

			if (search == null) {
				throw new IndexOutOfBoundsException("Invalid key: " + key);
			}
		}
		return search.getValue();
		}

		public V remove(K key) {
		if (head == null) {
			throw new IndexOutOfBoundsException("No items in list");
		}

		Node<K, V> search = head;
		int index = getBucketIndex(key);
		for (int i = 0; i < index; i++) {
			search = search.getNext();
		}
		if(index == size() - 1){
			throw new IndexOutOfBoundsException("Element(s) in LIST " + (size() - 1));
		}
		head = head.getNext();
		return null;
	}

	private int getBucketIndex(K key){
		return Math.abs(key.hashCode());
	}

	public Object clear() {
		while (head != null) {
			head = null;
		}
		return null;
	}

}
