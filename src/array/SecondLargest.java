package array;

public class SecondLargest {
	public static void main(String[] args) {
		
		int [] arr = {3,999,11,23,350,57,89,101};
		
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {  
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if (i == 2) {
					break;
				}
			}
		}
		

		System.out.println(arr[1]);
	}
}
