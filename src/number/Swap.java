package number;

public class Swap {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		System.out.println("Before Swapping a:"+a+" b:"+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping a:"+a+" b:"+b);
	}
}
