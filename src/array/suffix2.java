package array;

public class suffix2 {
public static void main(String[] args) {
	
	int arr[]= {1,4,6,3,9,7,20};
	arr[arr.length-1]=arr[arr.length-1];
	
	for (int i = arr.length-2; i>=0; i--) {
		arr[i]=arr[i+1]+arr[i];
	}
	
	Printa.print(arr);
}
}