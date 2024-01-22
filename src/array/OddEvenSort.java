package array;

public class OddEvenSort {
	public static void main(String[] args) {
		int [] arr= {67,98,65,54,34,21,78,90,88,77};
		
		int temp;
		int i = 0;
		int j=arr.length-1;

		while (i <= j) {
			if (arr[i]%2==0) {
				i++;
			} 
			else if (arr[j]%2!=0) {
				j--;
			} 
			else {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		printArray(arr);

	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
