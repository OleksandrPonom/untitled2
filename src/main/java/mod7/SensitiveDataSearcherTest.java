package mod7;

import java.util.Arrays;

class SensitiveDataSearcher{
	public boolean isSensitiveDataPresent(String phrase){
		String[] sensitiveDatas = {"pass", "key", "login", "email"};
		String[] isParses = phrase.toLowerCase().split("\\s+");

		boolean result = false;
			for (String isParse : isParses) {
				for (String sensitiveData : sensitiveDatas) {
					if (isParse.startsWith(sensitiveData)) result = true;
				}
			}
		return result;
	}
}


class SensitiveDataSearcherTest {
	public static void main(String[] args) {
		SensitiveDataSearcher searcher = new SensitiveDataSearcher();

		//false
		System.out.println(searcher.isSensitiveDataPresent("Hello world"));

		//true
		System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
	}
}
