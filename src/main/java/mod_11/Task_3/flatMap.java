package mod_11.Task_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.List.of;
import static java.util.stream.Collectors.*;
import static java.util.stream.Stream.*;

/*

Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,, наприклад:
*/

public class flatMap {
	private static List<String> arrayList = Arrays.asList("1, 2, 0", "4, 5");


	public static void main(String[] args) {
		String sortElementArrays = arrayList.stream()
				.map(String::valueOf)
				.sorted(Comparator.reverseOrder())
		//		.flatMap()
		//		.sorted()

			.collect(joining(", "));


		System.out.println("sortElementArrays = " + sortElementArrays); //0, 1, 2, 4, 5
	}


}
