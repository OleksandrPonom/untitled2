package mod_11.Task_5;

/*

Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
який "перемішує" елементи зі стрімів first та second, зупиняючись тоді,
коли у одного зі стрімів закінчаться елементи.


*/

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MargeStrem<T> {
	public Stream<T> first;
	public Stream<T> second;

	public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
	//	List<T> margeStream = first.flatMap(Collections::toString);
		return null;
	}
}

