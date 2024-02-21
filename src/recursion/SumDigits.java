package recursion;

public class SumDigits {
	public static void main(String[] args) {
		
		int num = 34567;
		
		System.out.println(digitSum(num));
		
	}

	private static int digitSum(int num) {
		if(num>=0 && num<=9) {
			return num;
		}
		
//		num = num%10;
		int smallAns = digitSum(num/10);
		int sum = smallAns + num%10;
		
		return sum;
	}
}
