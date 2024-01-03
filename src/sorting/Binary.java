package sorting;

public class Binary {
	public static void main(String[] args) {

		int [] arr = {3,9,11,23,35,57,89,101};

		int num = 23;
//		int num = 22; 

		int l = 0;
		int r = arr.length-1;
		int m = (l+r)/2;
		int temp;
		System.out.println(l+" "+r+" "+m);
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {  
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}

		int count = 0;
		while ( l<=r ) {
			if(arr[m] == num){
				System.out.println("element at index : "+m);
				count++;
				break;
			}
			else if (arr[m] < num) {
				l = m+1;
			}
			else {
				r = m-1;
			}
			m = (l+r)/2;
			
		} 

		if (count == 0) {
			System.out.println("element is not prsent in array");
		}
		
	}
}
