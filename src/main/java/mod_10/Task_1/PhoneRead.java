package mod_10.Task_1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRead {
	private static final String FILE_INPUT_PATH = "src/main/java/mod_10/Task_1/Files/file.txt";

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(FILE_INPUT_PATH);
		FileInputStream fis = new FileInputStream(file);
		Scanner scanner = new Scanner(fis);
		String regex = "^\\(?(\\d{3})\\)?[-]?\\s?(\\d{3})[-]?(\\d{4})$";
		Pattern pattern = Pattern.compile(regex);
		while (scanner.hasNext()){
			String fileLine = scanner.nextLine();
			Matcher matcher = pattern.matcher(fileLine);
			while (matcher.find()) {
				System.out.println(fileLine);
			}
		}
	}
}



