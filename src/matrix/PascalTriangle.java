package matrix;

import java.util.Scanner;

import array.print;

public class PascalTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Rows");
		int a = sc.nextInt();
		pascal(a);
		
	}

	private static void pascal(int a) {
		int [][] arr = new int [a][];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
			
			arr[i][0] = arr[i][i] = 1;
			
			for (int j = 1; j < arr[i].length-1; j++) {
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		Print.printArray(arr);
	}
}
