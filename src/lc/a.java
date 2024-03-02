package lc;

public class a {
    public static void main(String[] args) {
        int[] arr = {-7, -3, 1, 2, 3, 11};
        Printa.print(arr);
        sortedSquares(arr);
    }

    public static void sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int i = 0;
        int j = n - 1;
        int k = n - 1;

        while (i <= j) {
            int squareI = arr[i] * arr[i];
            int squareJ = arr[j] * arr[j];

            if (squareI > squareJ) {
                result[k] = squareI;
                i++;
            } else {
                result[k] = squareJ;
                j--;
            }

            k--;
        }

        Printa.print(result);
    }
}
