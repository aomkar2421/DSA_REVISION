package number;

public class ReverseNum2 {
	public static void main(String[] args) {

		int num = 2345;
		String str = String.valueOf(num);
		
//		for (int i = str.length()-1; i >= 0; i--) {
//			System.out.print(str.charAt(i));
//		}
		
		String revStr = "";
		for (int i = str.length()-1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		num = Integer.parseInt(revStr);
		System.out.println(num);
	}
}
