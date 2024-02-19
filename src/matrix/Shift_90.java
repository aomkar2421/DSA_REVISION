package matrix;

import array.ReverseArray;

public class Shift_90 {
	public static void main(String[] args) {
		int[][] arr1 = {{2, 4, 5, 6}, {8, 1, 3, 4}, {9, 7, 6, 7}, {1, 2, 3, 4}};
		Print.printArray(arr1);
		
		transpose(arr1);

	}
	
	
	public static void transpose(int [][] arr1) {
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j < arr1[0].length; j++) {
				int temp = arr1[i][j];
				arr1[i][j] = arr1[j][i];
				arr1[j][i] = temp;
			}
		}
		
		Print.printArray(arr1);
		System.out.println();

		for (int i = 0; i < arr1.length; i++) {
			reverseArray(arr1[i]);
		}
		
		Print.printArray(arr1);
		
	}
	
	
	static void reverseArray(int [] arr){
		int i = 0;
		int j = arr.length-1;
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
}
