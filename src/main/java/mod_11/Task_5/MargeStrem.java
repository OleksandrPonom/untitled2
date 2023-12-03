package mod_11.Task_5;

/*

Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
який "перемішує" елементи зі стрімів first та second, зупиняючись тоді,
коли у одного зі стрімів закінчаться елементи.


*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MargeStrem<T> {

	public static void main(String[] args) {
		Stream<Integer> first = Stream.of(1, 2, 3, 4, 5, 6);
		Stream<Integer> second = Stream.of(11, 12, 13, 14);

		Stream<Integer> stringMargeStrem = zip(first, second);
		System.out.println("stringMargeStrem = " + stringMargeStrem.collect(Collectors.toList()));
	}

	public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){

		Iterator<T> firstStream = first.collect(Collectors.toList()).iterator();
		Iterator<T> secondStream = second.collect(Collectors.toList()).iterator();

		List<T> streamElement = new ArrayList<>();

		while (firstStream.hasNext()&&secondStream.hasNext()){
			streamElement.add(firstStream.next());
			streamElement.add(secondStream.next());
		}

		return streamElement.stream();
	}
}

