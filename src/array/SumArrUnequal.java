package array;

public class SumArrUnequal {
    public static void main(String[] args) {
        int arr1[] = {6, 58, 68, 97, 76, 73, 42, 1};
        int arr2[] = {16, 2, 12, 3, 4};
        int length;

        if (arr1.length > arr2.length) {
            length = arr1.length;
        } else {
            length = arr2.length;
        }

        int sum[] = new int[length];

        for (int i = 0; i < length; i++) {
            int a = (i < arr1.length) ? arr1[i] : 0;
            int b = (i < arr2.length) ? arr2[i] : 0;

            sum[i] = a + b;
        }

        Printa.print(arr1);
        Printa.print(arr2);
        Printa.print(sum);
    }
}
