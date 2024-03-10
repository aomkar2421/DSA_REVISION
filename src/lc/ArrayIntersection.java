package lc;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayIntersection {
	
    public static void main(String[] args) {
        int [] arr1 = { 4,9,5 };
        int [] arr2 = { 9,4,9,8,4 };
        Printa.print(arr1);
        Printa.print(arr2);
        
        function(arr1,arr2);
    }

    
    public static void function(int[] arr1,int[] arr2) {
        
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	
    	for (int i = 0; i < arr1.length; i++) {
			hm.put(arr1[i], hm.getOrDefault(arr1[i], 0)+1);
		}
    	
    	for (int i = 0; i < arr2.length; i++) {
			if(hm.containsKey(arr2[i])) {
				al.add(arr2[i]);
				hm.remove(arr2[i]);
			}
		}
    	
    	int [] result = new int[al.size()];
    	for (int i = 0; i < result.length; i++) {
			result[i] = al.get(i);
		}
    	
    	Printa.print(result);
    }
    
}
