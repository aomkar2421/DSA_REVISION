package sorting;

public class FirstOccurance {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,4,5,5,5,5,5,6,7,8,9,9,9};
		int num = 5;
		int l = 0;
		int r = arr.length-1;
		int m = (l+r)/2;
		int fo=-1;
		while (l<=r) {
			if (num == arr[m]) {
				fo = m;
				r = m-1;
			}else if (num < arr[m]) {
				r = m-1;
			}else if (num > arr[m]) {
				l = m+1;
			}
			m = (l+r)/2;
		}
		System.out.println(fo);
	}
}
