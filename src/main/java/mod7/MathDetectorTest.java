package mod7;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MathDetector{
	public boolean isMath(String text){
		boolean result =false;
		String regex = "\\d+\\=\\+?\\*?\\-?\\/?";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			result = true;
		}

		return result;
	}
}


class MathDetectorTest {
	public static void main(String[] args) {
		//true
		System.out.println(new MathDetector().isMath("2+2=4"));

		//false
		System.out.println(new MathDetector().isMath("1992 is great year"));

		//false
		System.out.println(new MathDetector().isMath("Venus vs Earth"));

		//true
		System.out.println(new MathDetector().isMath("2*2=4"));
	}
}
