package mod7;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailDetector{
	public boolean isPresent(String text){
		boolean result = false;
		String regex = "\\S{2,}[\\@]\\S{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			result = true;
		}

		return result;
	}
}



class EmailDetectorTest {
	public static void main(String[] args) {
		//true
		System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

		//false
		System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
	}
}
