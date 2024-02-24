package lc;

public class Stock1 {
	public static void main(String[] args) {
		int [] arr = {7,6,4,3,1};

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = Integer.MIN_VALUE;
		int profit;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<minPrice) {
				minPrice = arr[i];
			}
			
			profit = minPrice - arr[i];
			
			if (profit > maxProfit) {
				maxProfit = profit;
			}
			
		}
		System.out.println(maxProfit);
	}
}
