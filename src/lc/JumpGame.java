package lc;

public class JumpGame {
	public static void main(String[] args) {
		
		int [] arr = {2,2,1,0,4};
		
		int finalPosition = arr.length-1;
		
		for (int i = arr.length-1; i >= 0; i--) {
			if (i+arr[i] >= finalPosition) {
				finalPosition = i;
			}
		}
			System.out.println(finalPosition);
	}	
}		
