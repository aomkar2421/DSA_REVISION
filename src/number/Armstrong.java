package number;

public class Armstrong {
	public static void main(String[] args) {
		
		int a = 13;
		String str = Integer.toString(a);
		int len = str.length();
		int num = a;
		int res = 0;
		
		for (int i = 0; i < len; i++) {
			int rem = num % 10;
			rem = (int) Math.pow(rem, len);
			res = res + rem;
			num = num/10;
		}
		
		System.out.println("Original Number : "+a);
		System.out.println("New Number : "+res);
		
		if (a == res) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is not armstrong");
		}
		
	}
}