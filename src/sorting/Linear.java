package sorting;

public class Linear {
	public static void main(String[] args) {
		
		int [] arr = {12,7,23,4,67,43,31};
		
		int num = 31;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("element found at index : "+i);
				break;
			}
		}
		
	}
}
