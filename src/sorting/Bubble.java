package sorting;

public class Bubble {
	public static void main(String[] args) {
		int [] arr = {21,43,89,34,23,78,43,1,56,8,93,95,97,99};
		int temp ;

		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {  
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n"+count);
	}
}
