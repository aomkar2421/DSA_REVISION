package array;

public class PrefixSum {
	
	public static void main(String[] args) {
		
		int [] arr = {12,11,20,10,14,5};
		int [] pre = new int [arr.length];
		
		pre[0] = arr[0];
		for (int i = 1; i < pre.length; i++) {
				pre[i] = pre[i-1] + arr[i];
		}
		
		printArray(arr);
		printArray(pre);
		
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}