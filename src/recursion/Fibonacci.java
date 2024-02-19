package recursion;

public class Fibonacci {
	public static void main(String[] args) {
		int n=5;
		System.out.println(fib(n));
	}

	private static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int prev = fib(n-1);
		int prevPrev = fib(n-2);

		return prev + prevPrev;

	}
}