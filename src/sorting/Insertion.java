package sorting;

import lc.Printa;

public class Insertion {
	public static void main(String[] args) {
		int [] arr = {8, 3, 6, 2, 4, 5};
		
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j>0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		Printa.print(arr);
	}
}			
			