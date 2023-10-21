package mod_11.Task_1_2;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class WorkingWithLists {
	private static List<String> names = List.of("Igor", "Andrey", "Sergey", "Ivan", "Petro", "Dmitro", "Artur", "Egor", "Oleksandr", "Yaroslav");

	public static void main(String[] args) {

		List<String> unpairedIndex = names;
	//			.iterator();
	//			.filter(names.size() = 1)
	//			.collect(toList());

		System.out.println("unpairedIndex = " + unpairedIndex);

		List<String> reversSort = names.stream()
			 	.sorted(Comparator.reverseOrder())
				.map(String::toUpperCase)
				.collect(toList());

		System.out.println("reversSort = " + reversSort);
	}
}
