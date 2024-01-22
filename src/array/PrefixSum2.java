package array;

public class PrefixSum2 {
	
	public static void main(String[] args) {
		
		int [] arr = {12,11,20,10,14,5};
		printArray(arr);

		for (int i = 1; i < arr.length; i++) {
				arr[i] = arr[i-1] + arr[i];
		}
		
		printArray(arr);
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}