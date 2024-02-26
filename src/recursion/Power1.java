package recursion;

public class Power1 {
	public static void main(String[] args) {

		System.out.println(calcPower(2,6));

	}


	private static int calcPower(int p, int q) {
		if (q == 0 ) {
			return 1;
		}

		int smallAns = calcPower(p, q/2);
		if (q%2 == 0) {
			return smallAns * smallAns;
		}else {
			return p * smallAns * smallAns;
		}

	}
}
