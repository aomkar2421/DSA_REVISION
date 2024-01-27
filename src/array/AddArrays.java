package array;
	
public class AddArrays {
	public static void main(String[] args) {
		int [] arr1 = {12,34,56,76};
		int [] arr2 = {45,22,62,90,12,34,50};
		int max = 0;
		
		if (arr1.length > arr2.length) {
			max = arr1.length;
		} else {
			max = arr2.length;
		}
		int [] sum = new int[max];
		
		for (int i = 0; i < max; i++) {
			int a = (arr1.length > i) ? arr1[i] : 0 ;
			int b = (arr2.length > i) ? arr2[i] : 0 ;
			sum[i] = a + b;
		}
		
		Printa.print(sum);
		
	}
}	
	