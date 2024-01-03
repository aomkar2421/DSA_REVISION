package starpattern;

public class Pattern10 {
	public static void main(String[] args) {
		for (int i = 0; i <=5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				if (j==0) {
					System.out.print("*");
				}else if(i>j){
					System.out.print(" ");
				}
			}
			
			for (int j = 1; j <=i; j++) {
				if (j==i) {
					System.out.print(" *");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
