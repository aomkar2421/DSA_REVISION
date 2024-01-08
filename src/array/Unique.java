package array;

public class Unique {
	public static void main(String[] args) {
		int [] arr = {10 , 12 , 11 , 18 , 10 , 30 , 18 , 12};

		for (int i = 0; i < arr.length; i++) {
			int counter = 0;
			
			for (int j = 0; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					counter++;
				}
			}
			
			if (counter == 1) {
				System.out.println(arr[i]);
			}
			
		}
	}
}
