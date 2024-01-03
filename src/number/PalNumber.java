package number;

import java.util.Scanner;

public class PalNumber {
	static int num;
	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int rev = revNum(num);
		boolean res = palCheck(rev);
		
		if (res) {
			System.out.println("Number Is Palindrome");
		} else {
			System.out.println("Number Is Not Palindrome");
		}
	}

	static int revNum(int num) {
		int rem , rev = 0;

		while (num!=0) {
			rem = num % 10;
			rev = rev *10 + rem;
			num = num/10;
		}
		return rev;
	}

	static boolean palCheck(int rev) {
		boolean flag;
		if (rev == num) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

}
