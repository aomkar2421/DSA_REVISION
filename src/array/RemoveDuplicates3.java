package array;

import java.util.HashMap;

public class RemoveDuplicates3 {
	public static void main(String[] args) {
		
		int [] arr = {2 ,3 ,3 ,9 ,9 ,11 ,23 , 57 ,57 ,99 ,101 ,101 ,102};
		
		HashMap<Integer, Integer> hs = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			hs.put(i, arr[i]);
		}
		
		System.out.println(hs.get(8));
			
		
	}
}
