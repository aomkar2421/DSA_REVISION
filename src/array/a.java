package array;

public class a {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8},
                {7, 6},
                {5, 4}
        };

        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        int[][] result = addMatrices(matrix1, matrix2);

    }

    // Function to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Check if matrices are compatible for addition
        if (rows1 != rows2 || cols1 != cols2) {
            return null; // Matrices are not compatible for addition
        }

        int[][] result = new int[rows1][cols1];

        // Perform addition
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Function to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
