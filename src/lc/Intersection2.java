package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Intersection2 {
	
    public static void main(String[] args) {
        int [] arr1 = { 4,9,5 };
        int [] arr2 = { 9,4,9,8,4 };
        Printa.print(arr1);
        Printa.print(arr2);
        
        function(arr1,arr2);
    }

    
    public static void function(int[] arr1,int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        HashSet<Integer> hs = new HashSet<Integer>();
    	
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	int i=0,j=0;
    	
    	while (i<arr1.length && j<arr2.length) {
			if (arr1[i] == arr2[j]) {
				hs.add(arr1[i]);
				i++;j++;
			}
			else if (arr1[i] > arr2[j]) {
				j++;
			}
			else {
				i++;
			}
		}
    	
    	System.out.println(hs);
    	
    	for (Integer i2 : hs) {
			al.add(i2);
		}
    	
    	int [] result = new int[al.size()];
    	System.out.println(al);
    	
    	for (int k = 0; k < al.size(); k++) {
			result[k] = al.get(k);
		}
    	
    	Printa.print(result);
    }
    
}
