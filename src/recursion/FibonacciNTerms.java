package recursion;

public class FibonacciNTerms {
	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i <= 10; i++) {
			System.out.println(fib(i));
		}
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