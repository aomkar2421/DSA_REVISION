package array;

public class Largest {
	public static void main(String[] args) {
		
		int [] arr = {3,9,11,23,350,57,89,101};
		int large = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println(large);
	}
}
