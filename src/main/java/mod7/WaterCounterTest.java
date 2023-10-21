package mod7;


class WaterCounter{
	public double count(String text){
		double result = 0;
		int leng = 0;
		int count = 0;
		char[] isParses = text.toCharArray();
		for (int i = 0; i < isParses.length; i++) {
			if(isParses[i] == ' ') {
				count += 1;
			} leng += 1;
		}
		result = (double) count / leng;
		return result;
	}
}

class WaterCounterTest {
	public static void main(String[] args) {
		//0.07692307692307693
		System.out.println(new WaterCounter().count("Moon invaders"));

		//0
		System.out.println(new WaterCounter().count("NoWater"));
	}
}
