package gfg;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicates {
	public static void main(String[] args) {

		int [] arr = {2,13,1,22,3};
		duplicates(arr, arr.length);

	}
	public static ArrayList<Integer> duplicates(int arr[], int n) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				al.add(arr[i]);
			}
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		
		System.out.println(al);
		
		if (al.isEmpty()) {
			al.add(-1);
		}
		return al;
	}
}
