package recursion;


public class PrintIncreasing {
	public static void main(String[] args) {
		int num = 5;
		print(num);
		
	}

	private static void print(int num) {
		if (num == 1) {
			System.out.println(1);
			return;
		}
		
		print(num-1);
		System.out.println(num);
	}
}
