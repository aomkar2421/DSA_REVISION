package gfg;

import number.Swap;

public class Sort_012 {
	public static void main(String[] args) {
		int arr [] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		Print.printArr(arr);
		
		int low=0;
		int mid=0;
		int high=arr.length-1;
		int temp;
		
		while (mid<=high) {
			
			if (arr[mid] == 0) {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}else if (arr[mid] == 1) {
				mid++;
			}else if (arr[mid] == 2) {
				temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
				mid++;
				
				
			}
			
		}
		
		Print.printArr(arr);
		
	}
}
