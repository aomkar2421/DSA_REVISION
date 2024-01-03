package string;

import java.util.Scanner;

public class PalindromeStr {
	static String str;
	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		String rev = revString(str);
		boolean res = palCheck(rev);
		
		if (res) {
			System.out.println("String Is Palindrome");
		} else {
			System.out.println("String Is Not Palindrome");
		}
	}

	static String revString(String str) {
		String revStr = "";
		for (int i = str.length()-1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
		return revStr;
	}

	static boolean palCheck(String rev) {
		boolean flag;
		if (str.equals(rev)) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

}
