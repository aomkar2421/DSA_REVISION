package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CommonThree {
	public static void main(String[] args) {
		
		int arr1 [] = {278,56,9,4,5,61,13};
		int arr2 [] = {2,78,5,6,9,14,61,13,45};
		int arr3 [] = {27,8,56,9,4,5,61,13};
		
		Set<Integer> s1 = new HashSet<Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if (arr1[i] == arr2[j] && arr2[j]  == arr3[k]) {
						s1.add(arr1[i]);
					}
				}
			}
		}
  		System.out.println(s1);
	}
}
