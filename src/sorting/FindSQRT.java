package sorting;

public class FindSQRT {
	public static void main(String[] args) {
		
		int num = 15;
		int r = num;
		int l = 0;
		int ans = -1;
		
		while (l <= r) {
			int m = (l+r)/2;
			int val = m*m;
			
			if (val == num) {
				ans = m;
				break;
			}
			else if (val > num) {
				r = m-1;
			}
			else if (m*m < num) {
				l = m+1;
				ans = m;
			}
		}
		System.out.println(ans);
	}
}
