package sorting;

import lc.Printa;

public class Sort_0 {
	public static void main(String[] args) {

		int [] arr = {0,5,0,3,4,2};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == 0) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		Printa.print(arr);
	}
}
