package starpattern;

import java.util.Iterator;

public class Pattern9 {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j==i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
