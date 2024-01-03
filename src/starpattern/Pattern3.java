package starpattern;

public class Pattern3 {
	public static void main(String[] args) {
		int len = 5;
		
		for (int i = 0; i <= len; i++) {

			for (int j = len-1; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();

		}

	}
}