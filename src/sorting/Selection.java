package sorting;

public class Selection {
	public static void main(String[] args) {
		
		int arr [] = {76,12,90,78,43,9,21};
		
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			int temp;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if ( arr[j] < arr[min] ) {
					min = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
