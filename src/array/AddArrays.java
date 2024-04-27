package array;

public class AddArrays {
	public static void main(String[] args) {
		int [] arr2 = {12,34,56,76};
		int [] arr1 = {45,22,62,90,12,34,50};

		addArrays(arr1,arr2);
	}

	private static void addArrays(int[] arr1, int[] arr2) {
		int max = Integer.max(arr1.length,arr2.length);

		int [] sum = new int [max];

		if(arr1.length > arr2.length) {
			for (int i = 0; i < max; i++) {
				sum[i] = arr1[i] + (i > arr2.length-1 ? 0 : arr2[i]);
			}
		}else {
			for (int i = 0; i < max; i++) {
				sum[i] = arr2[i] +( i > arr1.length-1 ? 0 : arr1[i]);
			}
		}
		Printa.print(sum);
	}



}	
