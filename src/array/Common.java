package array;

public class Common {
	public static void main(String[] args) {
		
		int [] arr1 = {21,43,8,3,78,1,56};
		int [] arr2 = {21,43,89,34,23,1,56,8};

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
		
	}
}
