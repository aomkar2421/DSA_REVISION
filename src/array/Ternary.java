package array;

public class Ternary {
    public static void main(String[] args) {
    	
    	String ans = (10 > 5) ? "a" : "b";
    	System.out.println(ans);
    	
    	int x = 10;
    	int y = 20;
    	int max = (x > y) ? x : y;
    	System.out.println("The maximum value is: " + max);

    	int num = 13;
    	String res = (num %2 == 0) ? "even" : ((num%5 == 0) ? "divisible by 5" : "odd" ) ;
    	System.out.println(res);
    }
}
