package mod_11.Task_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

public class flatMap {
	private static List<String> arrayList = Arrays.asList("1, 2, 0", "4, 5");


	public static void main(String[] args) {
		Stream<String> sortElementArrays = arrayList.stream()
				.flatMap(String::lines)
				.sorted();
	//			.map(i -> i + 1)
		//		.sorted(Comparator.comparingInt(value -> s));
				//.collect(Collectors.toList());



		System.out.println("sortElementArrays = " + sortElementArrays);
		System.out.println("Arrays.toString(sortElementArrays.toArray()) = " + Arrays.toString(sortElementArrays.toArray()));
	}


}
