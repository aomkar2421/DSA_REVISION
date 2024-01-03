package array;

public class Merge {
	public static void main(String[] args) {
		
		int [] arr1 = {12,34,76,86,54,78,43,99};
		int [] arr2 = {5,8,1,4,9,25,2,23,3,24};
		
		int [] arr3 = mergeArray(arr1, arr2);
		
		System.out.println("Array 1");
		printArray(arr1);
		
		System.out.println("Array 2");
		printArray(arr2);
		
		System.out.println("Merge Array");
		printArray(arr3);
		
	}
	
	static int[] mergeArray(int [] arr1, int [] arr2) {
		
		int l = arr1.length + arr2.length;
		int [] arr3 = new int [l];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		int index = arr1.length;
		for (int i = 0; i < arr2.length; i++) {
			arr3[index] = arr2[i];
			index++;
		}
		return arr3;
	}
	
	static void printArray(int [] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
