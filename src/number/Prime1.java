package number;

public class Prime1 {
	public static void main(String[] args) {
	
		int num = 6;
		int counter = 0;
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}
	}
}
