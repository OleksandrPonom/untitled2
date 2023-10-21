package mod_10.Task_3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CounterValue {
	private static final String FILE_INPUT_PATH = "src/main/java/mod_10/Task_3/Files/words.txt";

	public static void main(String[] args) {
		File file = new File(FILE_INPUT_PATH);
		String result = null;

		try (FileReader fr = new FileReader(file)){
			char[] chars = new char[(int) file.length()];
			fr.read(chars);
			String fileContent = new String(chars);
			result = fileContent.replaceAll("\r\n", " ");
			System.out.println("fileContent = " + fileContent.replaceAll("\r\n", " "));
		} catch (IOException e){
			e.printStackTrace();
		}

		List<String> value = new ArrayList<>();
		for (String r : result.split(" ")){
			value.add(r.replaceAll("[^a-z]", ""));
		}

		Map<String, Long> counter = countDuplicateValue(value);
		System.out.println(counter);
	}

	public static Map<String, Long> countDuplicateValue(List<String> inputList){
		return inputList.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
	}

}
