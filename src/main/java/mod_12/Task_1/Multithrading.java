package mod_12.Task_1;

/*
	Напишіть програму, яка кожну секунду відображає на екрані дані про час,
	що минув від моменту запуску програми.

	Другий потік цієї ж програми кожні 5 секунд виводить повідомлення Минуло 5 секунд.
*/


import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Multithrading extends Thread{

	private int number;

	private Consumer<Integer> processor;

	private AtomicBoolean isNumberProcessed = new AtomicBoolean(true);

	public Multithrading(Consumer<Integer> processor) {
		this.processor = processor;
	}

	public boolean isNumberProcessed(){
		return isNumberProcessed.get();
	}

	public void process(int number) {
		this.number = number;
		this.isNumberProcessed.set(false);
	}

	@Override
	public void run() {
		while (true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}

			if(isNumberProcessed.get()){
				continue;
			}

			processor.accept(number);

			isNumberProcessed.set(true);
		}
	}
}
