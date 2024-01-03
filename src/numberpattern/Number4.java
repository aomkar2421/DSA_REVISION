package numberpattern;

public class Number4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			
			for (int j = i-1; j >= 1; j--) {
				if (i>1) {
					System.out.print(j+" ");
				}
			}
			
			System.out.println();
		}
	}
}
