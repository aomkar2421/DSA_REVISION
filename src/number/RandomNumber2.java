package number;

import java.util.Random;

public class RandomNumber2 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		System.out.println("random double bound");
		for (int i = 0; i < 3; i++) {
			System.out.println(random.nextDouble(100));
		}
		
		System.out.println("\nrandom double bound , origin");
		for (int i = 0; i < 3; i++) {
			System.out.println(random.nextDouble(90,100));
		}
		
				
	}
}
