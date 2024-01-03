package array;

public class Delete {
	public static void main(String[] args) {
		
		int [] arr1 = {12,34,76,86,54,78,43,99};
		int [] arr2 = new int [arr1.length-1];
		int num = 76;
		int index = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == num) {
				index = i;
			}
		}

		for (int i = 0; i < index; i++) {
			arr2[i] = arr1[i];
		}
		
		for (int i = index; i < arr2.length; i++) {
			arr2[i] = arr1[i+1];
		}
		
		System.out.println("Old Array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		System.out.println("New Array");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}
}
