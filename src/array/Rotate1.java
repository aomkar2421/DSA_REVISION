package array;

public class Rotate1 {
	public static void main(String[] args) {
		int [] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7};
		int [] arr1 = new int [arr.length];
		int k = 5;
		int n = arr.length;
		printArray(arr);
		int j = 0;
		for (int i = n-k ; i < n; i++) {
			arr1[j] = arr[i];
			j++;
		}
		
		for (int i = 0; i < n-k; i++) {
			arr1[j] = arr[i];
			j++;
		}
		printArray(arr1);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
