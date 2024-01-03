package numberpattern;

public class Number7 {
	public static void main(String[] args) {
		int counter = 0;

		for (int i = 1; i <= 5; i++) {
			
			if(i%2==0) {
				int num = counter + 3;
				int num2 = counter + 1;
				for (int j = num; j >= num2; j--) {
					counter++;
					System.out.print(j +" ");
				}

			}else {
				for (int j = 1; j <= 3; j++) {
					counter++;
					System.out.print(counter+" ");
				}
			}

			System.out.println();
		}
	}
}
