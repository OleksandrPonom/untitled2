package mod7;

class PalindromeDetector {
	public boolean isPalindrome(String word) {
		return word.equalsIgnoreCase(reverse(word));
	}

	private String reverse(String word) {
		String result = "";
		/*char[] chars = word.toCharArray();
		for(char c: chars) {
			result = c + result;
		}*/

		StringBuilder sb = new StringBuilder(word);
		result = String.valueOf(sb.reverse());
		return result;
	}
}

class PalindromeDetectorTest {
	public static void main(String[] args) {
		//false
		System.out.println(new PalindromeDetector().isPalindrome("Java"));

		//true
		System.out.println(new PalindromeDetector().isPalindrome("Noon"));
	}
}
