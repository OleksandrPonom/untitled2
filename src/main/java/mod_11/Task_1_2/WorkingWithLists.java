package mod_11.Task_1_2;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.Locale.filter;
import static java.util.stream.Collectors.*;

public class WorkingWithLists {
	private static List<String> names = List.of("Igor", "Andrey", "Sergey", "Ivan", "Petro", "Dmitro", "Artur", "Egor", "Oleksandr", "Yaroslav");

	public static void main(String[] args) {

		/*List<String> unpairedIndex = names.stream()
				.flatMap(x -> {
				})
				.filter()

				.collect(toList());*/

		/*IntStream.range(0, names.size() - 1)
				.filter(i -> i % 2 == 1)
				.flatMap(i -> names(i))
				.collect(toList());*/

	//	System.out.println("unpairedIndex = " + unpairedIndex);
		System.out.println();



		List<String> reversAndSort = names.stream()
			 	.sorted(Comparator.reverseOrder())
				.map(String::toUpperCase)
				.collect(toList());
		System.out.println("reversAndSort = " + reversAndSort);
	}
}
