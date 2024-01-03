package number;

public class FactorialRecursive {
	static int fact = 1;
	public static void main(String[] args) {
	
		int res = factorial(6);
		System.out.println(res);
	}
	
	static int factorial(int num) {

		if(num > 1) {
			//fact = num * factorial(num-1);
			fact = fact * num;
			factorial(num-1);
		}
		return fact;
	}
}
