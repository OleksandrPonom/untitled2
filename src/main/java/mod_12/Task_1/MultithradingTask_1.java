package mod_12.Task_1;


/*
	Напишіть програму, яка кожну секунду відображає на екрані дані про час,
	що минув від моменту запуску програми.

	Другий потік цієї ж програми кожні 5 секунд виводить повідомлення Минуло 5 секунд.
*/


import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class MultithradingTask_1 {
	public static long counter;

	@SneakyThrows
	public static void main(String[] args) {
		List<Thread> threads = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			threads.add(new Thread(()-> {
				for (int j = 0; j < 100; j++) {
					counter++;
				}
			}));
		}

		for (Thread thread : threads){
			thread.start();
		}
		for (Thread thread : threads){
			thread.join();
		}
		System.out.println("counter = " + counter);
	}
}
