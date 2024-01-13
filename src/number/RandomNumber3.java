package number;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;

public class RandomNumber3 {
	public static void main(String[] args) {
		
		double a = ThreadLocalRandom.current().nextDouble(20, 25);
		System.out.println(a);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt());
		}
	}
}
