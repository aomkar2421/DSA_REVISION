package numberpattern;

import java.util.Iterator;

public class Number2 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				counter++;
				System.out.print(counter+" ");
			}
			System.out.println();
		}
	}
}
