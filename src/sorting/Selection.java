package sorting;

import lc.Printa;

public class Selection {
	public static void main(String[] args) {

		int arr[] = {5, 3, 2, 1, 4};

		for (int i = 0; i < arr.length; i++) {
			int idx=i;
			int min = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = min;
			arr[idx] = temp;

		}
		Printa.print(arr);
	}
}
