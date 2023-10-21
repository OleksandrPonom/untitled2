package mod7;


class BigOrSmall{
	public String calculate(String text){
		String result = "";
		int upperCase = 0;
		int lowerCase = 0;

		for (int k = 0; k < text.length(); k++) {
			if (Character.isUpperCase(text.charAt(k))) upperCase++;
			if (Character.isLowerCase(text.charAt(k))) lowerCase++;
		}

		if(upperCase > lowerCase){
			result = "Big";
		} else if (upperCase < lowerCase) {
			result = "Small";
		} else if (upperCase == lowerCase) {
			result = "Same";
		}
		return result;
	}
}

class BigOrSmallTest {
	public static void main(String[] args) {
		//Small
		System.out.println(new BigOrSmall().calculate("Java"));

		//Big
		System.out.println(new BigOrSmall().calculate("JAVA"));

		//Same
		System.out.println(new BigOrSmall().calculate("jAvA"));
	}
}
