package array;

public class ReverseArray {
	public static void main(String[] args) {
		int [] arr = {10 , 12 , 11 , 18 , 10 , 30 , 18 , 12};
		int [] arr1 = new int [arr.length];
		
		int j = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			arr1[j] = arr[i];
			j++;
		}
		
		printArray(arr);
		printArray(arr1);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
