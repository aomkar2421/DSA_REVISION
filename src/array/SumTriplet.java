package array;

public class SumTriplet {
	public static void main(String[] args) {
		int [] arr = {10 , 12 , 15 , 18 , 20 , 30 , 28 , 25};
		int sum = 70;
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if (arr[i]+arr[j]+arr[k] == sum) {
						System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
						System.out.println();
						counter++;
					}
				}
			}
		}
		System.out.println("\nNumber Of Pairs Are : "+counter);
	}
}
