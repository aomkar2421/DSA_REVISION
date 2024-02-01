package gfg;

import java.util.ArrayList;

public class NearestHighest1 {
	public static void main(String[] args) {
		
		int [] arr= {9,3,5,7,9,6,4,1,6,5,9,4,14};
		
		if (arr.length<=2) {
			System.out.println("No Element");
			return;
		}
		
		for (int i = 1; i < arr.length-1; i++) {
			if (arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
