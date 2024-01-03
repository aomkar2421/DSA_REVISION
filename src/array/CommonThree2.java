package array;

public class CommonThree2 {
	public static void main(String[] args) {
		int arr1[]= {21,33,56,78,49,55,11,64};
		int arr2[]= {26,33,58,68,49,55,17,65};
		int arr3[]= {33,58,78,49,55,19,11,27};

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if (arr1[i]==arr2[j] && arr2[j]==arr3[k] ) {
						System.out.println(arr1[i]+" ");
					}
				}
			}
		}
	}
}
