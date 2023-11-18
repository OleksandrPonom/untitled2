package mod_11.Task_4;

import java.util.concurrent.atomic.AtomicLong;

public class RandomAlg {
	long a, c, m;
	private AtomicLong x;
	public RandomAlg(){
		this.a = 25214903917l;
		this.m = 2 ^ 48;
	}
	public RandomAlg withSeed (long c){
		this.c = 11l;
		x = new AtomicLong(c);
		return this;
	}

	public  long next(){
		return (a * x.getAndIncrement() + c) % m;
	}
}
