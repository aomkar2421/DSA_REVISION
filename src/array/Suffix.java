package array;

public class Suffix {
public static void main(String[] args) {
	
	int arr[]= {1,4,6,3,9,7,20};
	int suffix[]= new int[arr.length];
	int sum=0;
	
	suffix[arr.length-1] = arr[arr.length-1];
	
	for (int i = arr.length-2; i>=0; i--) {
//		sum=sum+arr[i];
//		prefix[i]=sum;
		suffix[i] = suffix[i+1] + arr[i];
	}
	
	Printa.print(suffix);

}
}
