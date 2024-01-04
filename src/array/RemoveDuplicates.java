package array;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		int [] arr = {2 ,3 ,3 ,9 ,9 ,11 ,23 , 57 ,57 ,99 ,101 ,101 ,102};
		
		int counter = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					counter++;
				}
			}
		}

		int length = arr.length - counter;
		int [] arr1 = new int[length];
		
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				System.out.println(j +" "+ arr[i]);
				arr1[j] = arr[i];
				j++;
			}
		}
		
		arr1[j] = arr[arr.length-1];
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}
}
