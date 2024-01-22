package array;

public class SuffixSum {
	
	public static void main(String[] args) {
		
		int [] arr = {12,11,20,10,14,5};
		int [] suf = new int [arr.length];
		
		suf[arr.length-1] = arr[arr.length-1];
		for (int i = suf.length-2; i >= 0; i--) {
				suf[i] = suf[i+1] + arr[i];
		}
		
		printArray(arr);
		printArray(suf);
		
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}