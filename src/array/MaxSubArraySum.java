package array;

public class MaxSubArraySum {

	public static void main(String[] args) {
		int [] arr = {6,-3,2,-4,-9,-2,3,4,-9,4,7,6} ;

		int maxsum = 0;
		int start;
		int end;
		for (int i = 0; i < arr.length; i++) {
			int sum =0;
			
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
//				System.out.println("sum is : "+sum);
				
				if (maxsum < sum) {
					maxsum = sum;
					start = i;
					end = j;
					System.out.println("Subarray is from index "+start+" to index "+end+" and the MAXSUM is "+maxsum);
				}
				if (sum<0) {
					sum = 0;
				}
			}
		}
	}
}