package array;

public class SecondSmallest2 {
	public static void main(String[] args) {
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		int [] arr = {89,40,2,650,120,7,23};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<first) {
				second = first;
				first = arr[i];
			}
			else if (arr[i] < second && arr[i] > first) {
				second = arr[i];
			}
		}
		
		System.out.println(first+" "+second);
	}
}
