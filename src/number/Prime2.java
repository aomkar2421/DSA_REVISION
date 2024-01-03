package number;

public class Prime2 {
	public static void main(String[] args) {

		int num = 100;

		for (int i = 1; i < num; i++) {
			int counter = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					counter ++;
				}
			}
			if (counter == 0) {
				System.out.print(i+" ");
			}
		}
		
	}
}
