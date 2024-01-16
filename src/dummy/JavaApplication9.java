package dummy;

import java.util.Scanner;  
public class JavaApplication9 {  
   static int Add(int x, int y)   
    {   
        while (y != 0)    
        {   
            int carry = x & y;   
            x = x ^ y;   
            y = carry << 1;   
        }   
        return x;   
    }    
    public static void main(String arg[])    
    {   
        Scanner sc = new Scanner(System.in);  
        System.out.println("First value is:- ");  
        int a=sc.nextInt();  
        System.out.println("Second value is:- ");  
        int b=sc.nextInt();  
        System.out.println("Sum of both digits:- "+Add(a, b));   
    }   
}  