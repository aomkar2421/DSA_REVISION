package array;

public class SortSquares {
	public static void main(String[] args) {
		
		int [] arr = {-4,-1,0,3,10};
		int [] ans = new int[arr.length];
		
		int j = arr.length-1;
		int i = 0;
		int index = 0;
		
		while(index < ans.length) {
			if (Math.abs(arr[i]) > Math.abs(arr[j])) {
				ans[index] = arr[i]*arr[i];
				i++;
				index++;
			} else {
				ans[index] = arr[j]*arr[j];
				j--;
				index++;
			}
		}
		
		printArray(arr);
		printArray(ans);
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
