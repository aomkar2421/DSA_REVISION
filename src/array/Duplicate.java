package array;

import java.util.Iterator;

public class Duplicate {
	public static void main(String[] args) {
		int [] arr = {3,9,11,2,350,57,9,11,56,3,23,57};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}
}
