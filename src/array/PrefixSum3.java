package array;

public class PrefixSum3 {
	public static void main(String[] args) {
		
		int arr[]= {1,4,6,3,9,7,20};
		int prefix[]= new int[arr.length];
		
		int sum=0;
		prefix[0] = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
//			sum=sum+arr[i];
//			prefix[i]=sum;
			prefix[i] = prefix[i-1]+ arr[i];
					}
		
		for (int i = 0; i < prefix.length; i++) {
			System.out.print(prefix[i]+" ");
		}
	}

}
