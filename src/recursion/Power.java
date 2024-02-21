package recursion;

public class Power {
	public static void main(String[] args) {
		
		System.out.println(calcPower(2,5));
		
	}

	private static int calcPower(int p, int q) {
		if (q == 1 ) {
			return p;
		}

		int smallAns = calcPower(p, q-1);
		int ans = p * smallAns;
		return ans;
	}
}
