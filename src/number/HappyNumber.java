package number;

public class HappyNumber {
	public static void main(String[] args) {
		
		int num = 32;
		int result = num;
		
		while (result != 1 && result !=4) {
			result = isHappyNumber(result);
		}
		
		if (result == 1) {
			System.out.println("Number Is Happy Number");
		} else {
			System.out.println("Number Is Not Happy Number");
		}
		
	}	
		
	private static int isHappyNumber(int result) {
		int num = result;
		int rem,sum=0;
		while (num > 0) {
			rem = num%10;
			sum = sum + (rem*rem);
			num = num/10;
		}
		return sum;
	}	
}		