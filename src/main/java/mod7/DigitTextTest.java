package mod7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DigitText{
	public boolean detect(String text){
		boolean result = true;
		Pattern pattern = Pattern.compile("[a-zA-Z]");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			result = false;
		}
		return result;
	}

}


class DigitTextTest {
	public static void main(String[] args) {
		//true
		System.out.println(new DigitText().detect("23 50"));

		//false
		System.out.println(new DigitText().detect("Year 1990"));
	}
}
