package lc;

public class MergeSorted {
	public static void main(String[] args) {
		
		int [] arr1 = {2 ,3 ,6, 9, 10, 17, 21, 0, 0, 0, 0, 0, 0};
		int [] arr2 = {0, 1 ,5 ,7 ,8 , 10};
		
		mergeArray(arr1 , 7 , arr2 , 6);	
	}

	private static void mergeArray(int[] arr1, int l, int[] arr2, int m) {
		int i = l-1;
		int j = m-1;
		int k = arr1.length-1;
		
		while (i>=0 && j>=0) {
//			System.out.println(k+" "+i+" "+j);
			if (arr1[i]>arr2[j]) {
				arr1[k] = arr1[i];
				i--;
				k--;
			} else {
				arr1[k] = arr2[j];
				j--;
				k--;
			}
		}
		
			while (j>=0) {
				arr1[k] = arr2[j];
				j--;
				k--;
			}
		
		Printa.print(arr1);
	}
}
