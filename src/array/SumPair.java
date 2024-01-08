package array;

public class SumPair {
	public static void main(String[] args) {
		int [] arr = {10 , 12 , 15 , 18 , 20 , 30 , 28 , 25};
		int sum = 40;
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j] == sum) {
					System.out.print(arr[i]+" "+arr[j]+" sum "+arr[i]+arr[j]);
					System.out.println();
					counter++;
				}
			}
		}
		System.out.println("\nNumber Of Pairs Are : "+counter);
	}
}
