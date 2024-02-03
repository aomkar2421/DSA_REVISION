package gfg;

import array.print;

public class SortNegatives {
	public static void main(String[] args) {
		
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 }; 
        int i = 0;
        int j = arr.length-1;
        int temp ;
        
        while (i<=j) {
			if (arr[i]<0) {
				i++;
			}else if (arr[j]>0) {
				j--;
			}else {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		Print.printArr(arr);
	}
}
