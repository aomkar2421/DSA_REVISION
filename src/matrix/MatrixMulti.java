package matrix;

public class MatrixMulti {
    public static void main(String[] args) {

        int[][] arr1 = {{2, 4, 5, 6}, {8, 1, 3, 3}};
        int[][] arr2 = {{2, 4, 1}, {8, 1, 1}, {9, 7, 1}, {1, 2, 1}};
        
        System.out.println("Matrix 1:");
       Print.printArray(arr1);
        
        System.out.println("\nMatrix 2:");
        Print.printArray(arr2);

        int[][] sum = multiplyMatrices(arr1, arr2);

        System.out.println("\nSum Matrix:");
        Print.printArray(sum);
    }

	private static int[][] multiplyMatrices(int[][] arr1, int[][] arr2) {

		int r1 = arr1.length;
		int c1 = arr1[0].length;
		int r2 = arr2.length;
		int c2 = arr2[0].length;
		
		if (c1 != r2) {
			System.out.println("Wrong Dimensions");
			return null;
		}
		
		int [][] arr3 = new int[r1][c2];
		
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < r2; k++) {
					
					arr3[i][j] =arr3[i][j] + (arr1[i][k] * arr2[k][j]);
					
				}
			}
		}
		
		return arr3;
	}



}		
