package matrix;

public class MatrixUnequalSum {
    public static void main(String[] args) {

        int[][] arr1 = {{2, 4, 5}, {8, 1, 3, 5, 1}, {9, 7, 6, 9},{4 ,4}};
        int[][] arr2 = {{2, 4, 5, 7}, {8, 1, 3}, {9, 7, 6}};
        
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
        int rows = Math.max(arr1.length, arr2.length);
        int cols = 0;

        for (int i = 0; i < rows; i++) {
            cols = Math.max(cols, Math.max(arr1[i].length, (i < arr2.length) ? arr2[i].length : 0));
        }

        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value1 = (i < arr1.length && j < arr1[i].length) ? arr1[i][j] : 0;
                int value2 = (i < arr2.length && j < arr2[i].length) ? arr2[i][j] : 0;
                sum[i][j] = value1 + value2;
            }
        }

        return sum;
    }
}
