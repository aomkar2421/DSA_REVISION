package sorting;

import lc.Printa;

public class LexicographicalFruits {
	public static void main(String[] args) {
		
		String [] arr = {"papaya", "lime", "lemon", "watermelon", "apple", "pineapple", "mango"};
		
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if ( arr[min].compareTo(arr[j]) > 0) {
					min = j;
				}
			}
			
			String temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
