package lc;

public class Stock2 {
	public static void main(String[] args) {
		
		int [] arr = {7,1,5,3,6,4};
		int profit = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] < arr[i]) {
				profit = profit + (arr[i] - arr[i-1]);
			}
		}
		System.out.println(profit);
	}
}
