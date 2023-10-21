package mod7;

class SummaryCreator{
	public String create(String text){
		String result = "";
		int max = 15;
		if(text.length() > max && text.charAt(15) != ' ') {
			result = text.substring(0, 15) + "...";
		} else if(text.length() > max && text.charAt(15) == ' '){
			result = text.substring(0, 15);
		} else result = text;

		return result;
	}
}


class SummaryCreatorTest {
	public static void main(String[] args) {
		SummaryCreator summaryCreator = new SummaryCreator();

		//Mars
		String shortPhrase = "Mars";
		System.out.println(summaryCreator.create(shortPhrase));

		//Java is very po...
		String longPhrase = "Java is very popular language";
		System.out.println(summaryCreator.create(longPhrase));
	}
}
