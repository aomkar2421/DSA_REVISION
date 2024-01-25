package array;

public class EqulSum {
	public static void main(String[] args) {
		
		int [] arr = {1 , 6, 3, 9 , 8, 8, 17 , 11, 3 , 4};
		checkArray(arr);
	}

	private static void checkArray(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		int preSum = 0;
		int sufSum = 0;
				
				
		while (i<=j) {
			if (preSum <= sufSum) {
				preSum = preSum + arr[i];
				i++;  
			}else if (sufSum <= preSum) {
				sufSum = sufSum + arr[j];
				j--;  				
			}		  	
		}				
		
		
		System.out.println(preSum+" "+sufSum);
		if (preSum == sufSum) {
			System.out.println("Can be Divided into sub arrays");
		}else {
			System.out.println("Cannot be Divided into sub arrays");
		}
	}
}
