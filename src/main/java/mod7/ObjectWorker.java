package mod7;

class ObjectWorker {
	public String join(Object[] objects) {
		String result = "";

		/*for(int i = 0; i < objects.length; i++) {
			result += objects[i];

			if (i != objects.length - 1) {
				result += " ";
			}
		}*/

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < objects.length; i++) {
			result = String.valueOf(sb.append(objects[i]).append(" "));
		}
		return result.trim();
	}
}

class ObjectWorkerTest {
	public static void main(String[] args) {
		Object[] data = {"Hello", 20L, 3.14f, true};

		//Hello 20 3.14 true
		System.out.println(new ObjectWorker().join(data));
	}
}
