package mod7;

class NameParser {
	public String parse(String[] names) {
		String result = "";

	/*	for(int i = 0; i < names.length; i++) {
			String firstName = names[i].split(" ")[0];

			result += firstName;
			if (i != names.length - 1) {
				result += ", ";
			}
		}*/
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			if (i != names.length - 1) {
				result = String.valueOf(sb.append(names[i].substring(0, names[i].indexOf(" "))).append(", "));
			} if(i == names.length - 1){
				result = String.valueOf(sb.append(names[i].substring(0, names[i].indexOf(" "))));
			}
		}
		return result;


	}
}

class NameParserTest {
	public static void main(String[] args) {
		String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

		//John, Bill, Nigua
		System.out.println(new NameParser().parse(names));
	}
}
