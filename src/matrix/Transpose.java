package matrix;

public class Transpose {
	public static void main(String[] args) {
		int[][] arr1 = {{2, 4, 5}, {8, 1, 3}, {9, 7, 6}};
		Print.printArray(arr1);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j < arr1[0].length; j++) {
				int temp = arr1[i][j];
				arr1[i][j] = arr1[j][i];
				arr1[j][i] = temp;
			}
		}
		System.out.println();
		Print.printArray(arr1);

	}
}
