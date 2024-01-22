package array;

public class Sort0and1 {
	public static void main(String[] args) {
		
		int [] arr1 = {0,0,1,1,0,1,0,1,1,0,1,0,1};
		printArray(arr1);

		int counter=0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 0) {
				counter++;
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			if (i<counter) {
				arr1[i] = 0;
			}else {
				arr1[i] = 1;
			}
		}
		
		printArray(arr1);
		
	}
	
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}