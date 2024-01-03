package number;

public class ReverseNum {
	public static void main(String[] args) {
		
		int num = 2345;
		System.out.println("Original Number : "+num);
		int rem , rev = 0;
		
		while (num!=0) {
			rem = num % 10;
			rev = rev *10 + rem;
			num = num/10;
		}
		System.out.println("New Number : "+rev);
	}
}
