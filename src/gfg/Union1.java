package gfg;

import java.util.ArrayList;
import java.util.HashSet;

public class Union1 {
	public static void main(String[] args) {
		
		int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 0, 2, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for (int a : arr1) {
			hs.add(a);
		}
        
        for (int a : arr2) {
			hs.add(a);
		}
        
        int [] ans = new int [hs.size()];
        
        for (int i : hs) {
			ans[i] = i;
		}
        Print.printArr(ans);
	}
}
