package mod_11.Task_1_2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Locale.filter;
import static java.util.stream.Collectors.*;

public class WorkingWithLists {
	private static List<String> names = List.of("Igor", "Andrey", "Sergey", "Ivan", "Petro", "Dmitro", "Artur", "Egor", "Oleksandr", "Yaroslav");

	public static void main(String[] args) {

		AtomicInteger i = new AtomicInteger(0);
		String unpairedIndex = names.stream()
				.filter(e -> ((i.getAndIncrement()) % 2 == 0))
				.map(e -> i + ". " + e)
				.collect(joining(", "));

		System.out.println();
		System.out.println("Names with unpaired index =  " + unpairedIndex);
		System.out.println();

		String reversAndSort = names.stream()
			 	.sorted(Comparator.reverseOrder())
				.map(String::toUpperCase)
				.collect(joining(", "));

		System.out.println("Names with revers and sorted = " + reversAndSort);
	}
}
