package recursion;

public class KMultiples {
	public static void main(String[] args) {
		int n = 7;
		int k = 3;
		System.out.println(multiples(n,k));
	}

	private static int multiples(int n, int k) {
		if(k == 1) {
			return 1;
		}
		
		int smallAns = multiples(n, k-1);
		int ans = n * smallAns;
		
		return ans;
	}
}
