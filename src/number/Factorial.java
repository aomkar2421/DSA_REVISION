package number;

public class Factorial {
	
	static int fact(int num) {
		int factorial=1;
		for (int i = factorial; i <= num; i++) {
			factorial = factorial *i;
		}
		
		return factorial;
	}
	public static void main(String[] args) {
		int res = fact(6);
		System.out.println(res);
	}
}
