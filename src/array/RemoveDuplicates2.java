package array;

public class RemoveDuplicates2 {
	public static void main(String[] args) {
		
		int [] arr = {2 ,3 ,3 ,9 ,9 ,11 ,23 , 57 ,57 ,99 ,101 ,101 ,102};
		
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				System.out.println(j +" "+ arr[i]);
				arr[j] = arr[i];
				j++;
			}
		}
		
		arr[j] = arr[arr.length-1];
		j++;
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
