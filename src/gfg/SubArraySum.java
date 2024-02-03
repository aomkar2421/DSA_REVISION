package gfg;

public class SubArraySum {
	public static void main(String[] args) {
		int [] arr= {9,3,5,7,9,6,4,1,6,5,9,4,14};
		int sum = 20;
		
		for (int i = 0; i < arr.length; i++) {
			int curSum = 0;
			for (int j = i; j < arr.length; j++) {
				curSum = curSum + arr[j];
				if (sum == curSum) {
					System.out.println("Sum found between index "+i+" "+j);
					break;
				}
				else if (sum < curSum) {
					break;
				}
				System.out.println(j);
			}
		}
	}
}
