package mod_12.Task_1;

import java.util.ArrayList;
import java.util.List;

public class MultithradingTest {
	public static void main(String[] args) {
		Multithrading process1 = new Multithrading((n) -> {
			if(n % 5 == 0){
				System.out.println( "5 second passed");
			}
		});

		Multithrading process2 = new Multithrading((n) -> {
			if(n % 5 != 0){
				System.out.println("Program is working " + n + " second");
			}
		});

		List<Multithrading> nps = new ArrayList<>();

		nps.add(process1);
		nps.add(process2);


		for (Multithrading np : nps){
			np.start();
		}

		for (int i = 1; i < 500; i++) {
			for (Multithrading np : nps){
				np.process(i);
			}


			while (true){
				int processedNumbersCount = 0;
				for (Multithrading np : nps){
					if (np.isNumberProcessed()){
						processedNumbersCount++;
					}
				}

				if(processedNumbersCount == 2){
					break;
				}
			}
		}
	}
}
