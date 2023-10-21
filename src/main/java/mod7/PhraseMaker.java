package mod7;

class PhraseMaker {
/*	public String join(String[] words) {
		String result = "";
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			if (word.length() <= 3) {
				word = word.toUpperCase();
			} else {
				word = word.toLowerCase();
			}

			result += word;
			if (i != words.length - 1) {
				result += " ";
			}
		}
		return result;
	}*/

	public String join(String[] words){
		String result = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() <= 3) {
				result = String.valueOf(sb.append(words[i].toUpperCase()).append(" "));
			} if (words[i].length() > 3) {
				result = String.valueOf(sb.append(words[i].toLowerCase()).append(" "));
			}

		}
		return result.trim();

	}

}

class PhraseMakerTest {
	public static void main(String[] args) {
		String[] words = {"Life", "is", "great", "thing"};

		//life IS great thing
		System.out.println(new PhraseMaker().join(words));
	}
}
