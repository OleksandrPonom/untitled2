package mod7;


class WordCombine{
	public boolean canCombine(String sourceWord, String targetWord){
		boolean result = false;
		int count = 0;
		String[] sourse = sourceWord.toLowerCase().split("");
		String[] target = targetWord.toLowerCase().split("");
		for (int i = 0; i < sourse.length; i++) {
			for (int j = 0; j < target.length; j++) {
				if(target[j].equals(sourse[i])) {
					count += 1;
				}
				}
			}
		if(count >= target.length){
			result = true;
		}
		return result;
	}
}

class WordCombineTest {
	public static void main(String[] args) {
		//true
		System.out.println(new WordCombine().canCombine("Forest", "tor"));

		//true
		System.out.println(new WordCombine().canCombine("Magic", "Mama"));

		//false
		System.out.println(new WordCombine().canCombine("War", "Piece"));

		//true
		System.out.println(new WordCombine().canCombine("WWEOUZU", "WEZ"));

	}
}
