package array;

import java.util.HashSet;

public class RemoveDuplicates3 {
	public static void main(String[] args) {
		
		int [] arr = {2 ,3 ,3 ,9 ,9 ,11 ,23 , 57 ,57 ,99 ,101 ,101 ,102};
		
		HashSet <Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		for (int a : hs) {
			System.out.println(a);
		}
			
		
	}
}
