package string;

public class ReverseStr2 {
	public static void main(String[] args) {
		
		String str = "HALKAT";
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}
}