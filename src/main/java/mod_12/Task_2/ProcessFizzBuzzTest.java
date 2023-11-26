package mod_12.Task_2;


import java.util.function.IntConsumer;

public class ProcessFizzBuzzTest {
	public static void main(String[] args) {
		ProcessFizzBuzz fizzBuzz = new ProcessFizzBuzz(15);

		Runnable printFizz = () -> System.out.println("fizz");
		Runnable printBuzz = () -> System.out.println("buzz");
		Runnable printFizzBuzz = () -> System.out.println("fizzbuzz");
		IntConsumer printNumber = number -> System.out.println(number);

		Thread threadA = new Thread(() -> {
			try {
				fizzBuzz.fizz(printFizz);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread threadB = new Thread(() -> {
			try {
				fizzBuzz.buzz(printBuzz);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread threadC = new Thread(() -> {
			try {
				fizzBuzz.fizzbuzz(printFizzBuzz);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread threadD = new Thread(() -> {
			try {
				fizzBuzz.number(printNumber);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		threadA.start();
		threadB.start();
		threadC.start();
		threadD.start();
	}
}

