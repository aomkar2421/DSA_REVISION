package array;

public class KElement {
	public static void main(String[] args) {
		
		int [] arr = {3,999,11,23,350,57,89,101};
		int elementNo = 4;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {  
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if (i == elementNo) {
					break;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("element at index "+elementNo+" is : "+arr[elementNo-1]);
		
	}
}