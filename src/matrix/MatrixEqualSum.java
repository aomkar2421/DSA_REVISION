package matrix;

public class MatrixEqualSum {
    public static void main(String[] args) {

        int[][] arr1 = {{2, 4, 5}, {8, 1, 3}, {9, 7, 6}};
        int[][] arr2 = {{2, 4, 5}, {8, 1, 3}, {9, 7, 6}};
        
        System.out.println("Matrix 1:");
        printArray(arr1);
        
        System.out.println("\nMatrix 2:");
        printArray(arr2);

        int[][] sum = addMatrices(arr1, arr2);

        System.out.println("\nSum Matrix:");
        printArray(sum);
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] addMatrices(int[][] arr1, int[][] arr2) {
    	int rows = arr1.length;
    	int cols = arr1[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return sum;
    }
}
