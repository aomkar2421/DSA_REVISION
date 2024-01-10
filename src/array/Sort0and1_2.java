package array;

public class Sort0and1_2 {
	public static void main(String[] args) {
		
		int [] arr = {0,0,1,1,0,1,0,1,1,0,1,0,1};
		printArray(arr);

		int temp;
		int i = 0;
		int j=arr.length-1;
		
		while (i < j) {
			if (arr[i] == 1) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			i++;
			j--;
		}
		
		printArray(arr);
		
	}
	
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}	
}		
		