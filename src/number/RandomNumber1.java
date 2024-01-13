package number;

public class RandomNumber1 {
	public static void main(String[] args) {
		
		System.out.println(Math.random());
	
		int min = 10;
		int max = 100;
		
		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random()*(max-min+1));
			System.out.println(r);
		}
		
		for (int i = 0; i < 10; i++) {
			double r = (Math.random()*(max-min+1)+min);
			System.out.println(r);
		}
		
		
	}
}
