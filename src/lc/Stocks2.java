package lc;

public class Stocks2 {
	public static void main(String[] args) {

		int arr [] = {7,1,5,3,6,4};
		maxProfit(arr);
	}

	public static void maxProfit(int[] arr) {
		int profit = 0;
		for (int i = 1; i < arr.length; i++) {
			if ( arr[i] > arr[i-1] ) {
				profit = profit + ( arr[i] - arr[i-1]);
			}
		}
		System.out.println(profit);
	}

}
