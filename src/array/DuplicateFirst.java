package array;

import java.util.Iterator;

public class DuplicateFirst {
	public static void main(String[] args) {
		int count = 0;
		int [] arr = {3,9,11,2,350,57,9,11,56,3,23,57};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					System.out.print("First Duplicate Element Is Prsent At Index : "+arr[i]);
				}
				if (count!=0) {
					break;
				}
			}
			
		}

	}
}
