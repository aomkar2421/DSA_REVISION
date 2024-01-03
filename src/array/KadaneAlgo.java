package array;

public class KadaneAlgo {

	public static void main(String[] args) {

		int [] arr = {6,-3,2,-4,9,-2,3,4,-3,4,-7,6} ;

		int sum = 0;
		int maxsum = 0;
//		int start;
//		int end;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
//			System.out.println("sum is : "+sum);
			
			if (maxsum < sum) {
				maxsum = sum;
//				start = i;
//				end = j;
				System.out.println("Subarray is  "+maxsum);
			}
			if (sum<0) {
				sum = 0;
			}
		}
	}
}