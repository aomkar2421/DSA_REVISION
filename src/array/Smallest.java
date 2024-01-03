package array;

public class Smallest {
	public static void main(String[] args) {
		
		int [] arr = {3,9,11,23,350,1,89,101};
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println(small);
	}
}
