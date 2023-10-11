package mod_9.Stack;

public class _MyStack {
	public static void main(String[] args) {
		MyStack<java.io.Serializable> stack = new MyStack<>();

		stack.push("head");
		stack.push("first");
		stack.push("second");

		System.out.println("stack size = " + stack.size());


		System.out.println("first element = " + stack.get(stack.size()-1));

		System.out.println("stack.peek() = " + stack.peek());
		System.out.println("stack.get(11) = " + stack.get(0));


	//	System.out.println("queue.poll() = " + stack.pop());
		
		stack.remove(1);
		System.out.println("stack.get(1) = " + stack.get(1));

		//stack.clear();
		//System.out.println("queue.get(0) = " + stack.get(0));

	}
}
