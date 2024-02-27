package lc;

public class JumpGame2 {
	public static void main(String[] args) {
		
		int [] arr  = {2,7,1,2,3,1,1,2};
		
		int destination = arr.length-1;
		int jumps = 0;
		int coverage = 0;
		int lastjumpindex = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			coverage = Math.max(coverage, i+arr[i]);
			
			if(i == lastjumpindex) {
				lastjumpindex = coverage;
				jumps++;
				
				if (coverage>=destination) {
					System.out.println(jumps);
					break;
				}
			}
		}
	}
}
