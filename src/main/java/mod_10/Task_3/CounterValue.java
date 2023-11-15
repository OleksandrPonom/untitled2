package mod_10.Task_3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


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

		Map<String, Integer> valueCount = new HashMap<>();
		value.forEach(n -> {
			if(valueCount.containsKey(n)) {
				valueCount.put(n, valueCount.get(n) + 1);
			} else {
				valueCount.put(n, 1);
			}
		});

		Map<String, Integer> sorted = sortByValue(valueCount);
		System.out.println("sorted = " + sorted);
	}


	public static <K,V extends Comparable<V>> Map<K, V> sortByValue(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {

			@Override
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<>();
		for (Iterator<Map.Entry<K, V>> it = list.iterator(); it.hasNext();) {
			Map.Entry<K, V> entry =  it.next();
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
}
