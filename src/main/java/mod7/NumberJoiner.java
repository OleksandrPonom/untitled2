package mod7;

class NumberJoiner {
/*	public String join(int[] numbers) {
		String result = "";
		for(int number: numbers) {
			result += number;
		}
		return result;
	}*/

	public String join(int[] numbers){
		String result = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numbers.length; i++) {
			result = String.valueOf(sb.append(numbers[i]));
		}
		return result;
	}
}

class NumberJoinerTest {
	public static void main(String[] args) {
		//102030
		System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
	}
}
