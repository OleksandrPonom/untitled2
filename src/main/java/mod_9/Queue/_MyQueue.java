package mod_9.Queue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _MyQueue {
	public static void main(String[] args) {
		MyQueue<String> queue = new MyQueue<>();

		queue.add("head");
		queue.add("first");
		queue.add("second");
		System.out.println("queue(zerro) = " + queue.size());


		System.out.println("queue.get(0) = " + queue.get(0));

		System.out.println("queue.peek() = " + queue.peek());

		System.out.println("queue.poll() = " + queue.poll());
		System.out.println("queue.get(0) = " + queue.get(0));
		
		queue.clear();
		System.out.println("queue.get(0) = " + queue.get(0));
	}
}
