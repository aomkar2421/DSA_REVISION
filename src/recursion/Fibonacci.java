package recursion;

public class Fibonacci {
	public static void main(String[] args) {
		int n=8;
		System.out.println(fib(n));
	}

	private static int fib(int n) {
		if(n == 0 || n ==1) {
			return n;
		}
		
		int smallProblem = fib(n-1)+fib(n-2);
		
		return smallProblem;
	}

}