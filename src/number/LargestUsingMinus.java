package number;

import java.util.Scanner;

public class LargestUsingMinus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a-b>0 && a-c>0) {
			System.out.println(a+" is Largest");
		} 
		else if (b-c>0 && b-a>0) {
			System.out.println(b+" is Largest");
		}
		else {
			System.out.println(c+" is Largest");
		}

	}
}
