package mod_11.Task_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomAlgStream {
	public static void main(String[] args) {
		RandomAlg ra = new RandomAlg();
		Stream <Long> iterate = Stream.iterate(0l, (seed) -> ra.withSeed(seed).next());

		List<Long> collect = iterate
				.peek(System.out::println)
				.limit(20)
				.collect(Collectors.toList());
	}
}
