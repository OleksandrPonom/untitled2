package mod_10.Task_1;

import java.io.*;
import java.util.Scanner;

public class PhoneRead extends Reader {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("src/main/java/mod_10/Task_1/Files/file.txt");
		FileInputStream fis = new FileInputStream(file);
		Scanner scanner = new Scanner(fis);
	//	Pattern pattern = new PatternSyntaxException("/n");
		while (scanner.hasNext()){
			String fileLine = scanner.nextLine();

			System.out.println("fileLine = " + fileLine);
		}
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		return 0;
	}

	@Override
	public void close() throws IOException {

	}
}
