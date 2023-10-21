package mod_10.Task_2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RefactoringFile {
	private static final String FILE_INPUT_PATH = "src/main/java/mod_10/Task_2/Files/file.txt";


	public static void main(String[] args) {
		File file = new File(FILE_INPUT_PATH);

		try (FileReader fr = new FileReader(file)) {
			char[] chars = new char[(int) file.length()];
			fr.read(chars);
			String fileContent = new String(chars);
			System.out.println("fileContent = " + fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
