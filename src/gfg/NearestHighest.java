package gfg;

import java.util.ArrayList;

public class NearestHighest {
	public static void main(String[] args) {
		
		int [] arr= {9,3,5,7,9,6,4,1,6,5,9,4,14};
		System.out.println(findHighest(arr));
		
	}

	private static ArrayList<Integer> findHighest(int[] arr) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		if (arr.length<=2) {
			return null;
		}
		
		for (int i = 1; i < arr.length-1; i++) {
			if (arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				result.add(arr[i]);
			}
		}
		
		return result;
	}
}
