package mod7;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DigitExtracter{
	public int[] extract(String text){
		String digit = "";
		String regex = "\\d+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			digit += matcher.group();
		}
		String[] prevs = digit.split("");
		int[] result = new int[prevs.length];

		for (int i = 0; i < prevs.length; i++) {
			result[i] = Integer.parseInt(prevs[i]);
		}
		return result;
	}
}

class DigitExtracterTest {
	public static void main(String[] args) {
		DigitExtracter digitExtracter = new DigitExtracter();

		int[] extracted = digitExtracter.extract("april 5, year 2000");

		//[5, 2, 0, 0, 0]
		System.out.println(Arrays.toString(extracted));
	}
}
