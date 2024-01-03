package array;

public class SecondLargest2 {
	public static void main(String[] args) {
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		int [] arr = {12,89,45,32,650,12,76,12,23,9};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>first) {
				first = arr[i];
			}else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		System.out.println(first+" "+second);
	}
}
