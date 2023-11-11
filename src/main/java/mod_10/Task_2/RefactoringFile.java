package mod_10.Task_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RefactoringFile {
	private static final String FILE_INPUT_PATH = "src/main/java/mod_10/Task_2/Files/file.txt";
	private static final String FILE_OUTPUT_PATH = "src/main/java/mod_10/Task_2/Files/user.json";

	public static void main(String[] args) throws IOException {
		File file = new File(FILE_INPUT_PATH);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		FileInputStream fis = new FileInputStream(file);
		Scanner scanner = new Scanner(fis);
		JsonArray jsonArray = new JsonArray();

		String userName = "";
		int userAge = 0;
		String json = "";

		while (scanner.hasNextLine()) {
			String fileLine = scanner.nextLine();
			String regex = "[0-9]+";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(fileLine);
			while (matcher.find()) {
				StringBuilder sb = new StringBuilder();
				userName = String.valueOf(sb.append(fileLine.substring(0, fileLine.indexOf(" "))));
				userAge = Integer.parseInt(matcher.group());
				User user = new User(userName, userAge);
				json = gson.toJson(user);
				jsonArray.add(json);
			}

			FileWriter fileWriter = new FileWriter(FILE_OUTPUT_PATH);
			fileWriter.write(jsonArray.toString());
			fileWriter.close();
		}
	}
}
