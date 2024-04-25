package string;

public class Simpli {

	public static void main(String args[]){

		String str = "Simplielearn";

		String[] arrOfStr = str.split("i", 0);

		for (String a : arrOfStr)
			System.out.println(a);
	}

}