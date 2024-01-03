package array;

import java.util.HashSet;

public class LongestSequence {
	public static void main(String[] args) {
		
		int [] arr = {5,8,1,4,9,25,2,23,3,24};
		HashSet<Integer> h1 = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			h1.add(arr[i]);
		}
		
		System.out.println(h1);
		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			if(!h1.contains(arr[i] - 1)) {
				int no = arr[i];
				
				int counter = 0;
				while (h1.contains(no)) {
					counter++;
					no++;
				}
				
//				if (length < no - arr[i]) {
//					length = no - arr[i];
//				}
				
				if (length < counter) {
					length = counter;
				}
				
			}
		}
		System.out.println(length);
	}
}
