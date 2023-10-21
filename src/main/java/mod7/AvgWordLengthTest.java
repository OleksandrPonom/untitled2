package mod7;

import java.util.Arrays;

class AvgWordLength{
	public double count(String phrase){
		double result = 0;
		int leng = 0;
		String[] isParses = phrase.split("\\s+");
		for (int i = 0; i < isParses.length; i++) {
			leng += isParses[i].length();
			System.out.println("leng = " + leng);
		}
		result = (double)leng / isParses.length;
		return result;
	}
}

class AvgWordLengthTest {
	public static void main(String[] args) {
		//6
		System.out.println(new AvgWordLength().count("Launch Rocket"));

		//4.5
		System.out.println(new AvgWordLength().count("Life is strange thing"));
	}
}
