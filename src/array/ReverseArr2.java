package array;

public class ReverseArr2 {
	public static void main(String[] args) {
		int [] arr = {10 , 12 , 11 , 18 , 10 , 30 , 18 , 12};
		
		printArray(arr);

		int i = 0;
		int j = arr.length-1;
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
