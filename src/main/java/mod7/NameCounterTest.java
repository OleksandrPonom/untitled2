package mod7;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NameCounter{
	public int count(String text){
		int result = 0;
		String regex = "[A-Z]{1}[a-z]{1,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			result += 1;
		}

		return result;
	}
}

class NameCounterTest {
	public static void main(String[] args) {
		//1
		System.out.println(new NameCounter().count("Mars is great planet"));

		//2
		System.out.println(new NameCounter().count("Moon is near Earth"));

		//0
		System.out.println(new NameCounter().count("SPACE IS GREAT"));
	}
}
