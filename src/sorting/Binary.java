package sorting;

public class Binary {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int num = 6;
		int r = arr.length-1;
		int l = 0;
		int m = (l+r)/2;
		
		while (l <= r) {
			if (arr[m] == num) {
				System.out.println("Element found at index "+m);
				break;
			}
			else if (num > arr[m]) {
				l = m+1;
			}else if (num < arr[m]) {
				r = m-1;
			}
			m = (l+r)/2;
		}
		
	}
}
