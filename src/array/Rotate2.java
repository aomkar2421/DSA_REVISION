package array;

public class Rotate2 {
	public static void main(String[] args) {
		int [] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7};
		printArray(arr);
		
		int k = 5;
		int n = arr.length;		
		
		arr = reverseArray(arr, 0, n-k-1);
		arr = reverseArray(arr, n-k, n-1);
		arr = reverseArray(arr , 0 , n-1);

		printArray(arr);
	}

	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	static int[] reverseArray(int []arr,int start , int end) {
		int i = start;
		int j = end;
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		return arr;
	}
}
