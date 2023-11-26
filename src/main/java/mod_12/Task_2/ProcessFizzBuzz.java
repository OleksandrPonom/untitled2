package mod_12.Task_2;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class ProcessFizzBuzz extends Thread {
	private int n;

	private int number =1;
	private Semaphore fizz = new Semaphore(0);
	private Semaphore buzz = new Semaphore(0);
	private Semaphore fizzbuzz = new Semaphore(0);
	private Semaphore num = new Semaphore(1);

	public ProcessFizzBuzz(int n) {
		this.n = n;
	}

	public void fizz(Runnable printFizz) throws InterruptedException {
		for(int i = 3; i <= n; i += 3){
			fizz.acquire();
			printFizz.run();
			num.release();
		}
	}

	public void buzz(Runnable printBuzz) throws InterruptedException {
		for(int i = 5; i <= n; i += 5){
			buzz.acquire();
			printBuzz.run();
			num.release();
		}
	}

	public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
		for(int i = 15; i <= n; i += 15){
			fizzbuzz.acquire();
			printFizzBuzz.run();
			num.release();
		}
	}

	public void number(IntConsumer printNumber) throws InterruptedException {

		while(number <= n){
			num.acquire();
			if(number % 15 == 0){
				fizzbuzz.release();
			}else if(number % 5 == 0){
				buzz.release();
			}else if(number % 3 == 0){
				fizz.release();
			}else{
				printNumber.accept(number);
				num.release();
			}
			number++;
		}
	}
}
