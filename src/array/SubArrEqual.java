package array;

public class SubArrEqual {
	public static void main(String[] args) {
		int arr1[] = {6,58,68,97,76,73,42,1};
		int arr2[] = {16,2,12,3,4,7,8,9};
		int sum [] = new int [arr1.length];
		
		for (int i = 0; i < sum.length; i++) {
			sum[i] = arr1[i]-arr2[i];
		}
		Printa.print(arr1);
		Printa.print(arr2);
		Printa.print(sum);
	}
}
