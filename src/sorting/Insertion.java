package sorting;

import lc.Printa;

public class Insertion {
	public static void main(String[] args) {
		int [] arr = {8, 5, 3, 2, 1, 4};
		
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while (j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		Printa.print(arr);
	}
}			
			