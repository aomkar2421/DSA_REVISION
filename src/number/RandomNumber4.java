package number;

import java.util.Random;

public class RandomNumber4 {
	public static void main(String[] args) {
		
		Random random1 = new Random();  
		random1.ints(10, 10, 15).forEach(System.out::println);
		
	}
}
