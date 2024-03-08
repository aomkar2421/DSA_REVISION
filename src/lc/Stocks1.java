package lc;

public class Stocks1 {
	public static void main(String[] args) {

		int arr [] = {7,1,5,1,6,4};
		maxProfit(arr);
	}

	public static void maxProfit(int[] arr) {
		int min = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			
			int profit = arr[i] - min;
			
			if(profit > maxProfit) {
				maxProfit = profit;
			}
			
		}
		System.out.println(maxProfit);
	}

}
