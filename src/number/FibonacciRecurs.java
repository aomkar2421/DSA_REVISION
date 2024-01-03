package number;

public class FibonacciRecurs {
	static int a = 0;
	static int b = 1;
	static int c;
	public static void main(String[] args) {
		System.out.print(a+" "+b);
		fiboRecu(10);
	}
	
	static void fiboRecu(int i){
		
		if (i>=1) {
			
			c = a + b;
			System.out.print(" "+c);
			a = b;
			b = c;
			
			fiboRecu(i-1);
		}
	}
}
