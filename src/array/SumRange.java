package array;
// 1 based indexing
import java.util.Scanner;

public class SumRange {
	public static void main(String[] args) {
		int [] arr = {2, 3, 7, 9, 1, 4, 5, 6};
		int [] pre = prefixSum(arr);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Queries");
		int a = sc.nextInt();
		
		while (a != 0) {
			System.out.println("Enter Range");
			int s = sc.nextInt();
			int l = sc.nextInt();
			
			int sum = pre[l] - pre[s-1];
			System.out.println(sum);
			a--;
		}
		sc.close();
	}

	static int[] prefixSum (int [] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i];
		}
		return arr;
	}
}
