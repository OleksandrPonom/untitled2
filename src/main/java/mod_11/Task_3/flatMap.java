package mod_11.Task_3;

import java.util.*;

import static java.util.stream.Collectors.*;

public class flatMap {
	private static List<String> arrayList = Arrays.asList("1, 2, 0", "4, 5");


	public static void main(String[] args) {
		String sortElementArrays = arrayList
				.stream()
				.flatMap(str-> Arrays.stream(str.split(", ")))
				.sorted()
				.collect(joining(", "));

		System.out.println("sortElementArrays = " + sortElementArrays);
	}


}
