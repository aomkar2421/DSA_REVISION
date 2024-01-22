package dummy;

import java.util.Scanner;  
public class JavaApplication7 {  
    public static void main(String[] args)   
    {  
        int i, temp, sum=0, n;  
        Scanner sc = new Scanner(System.in);  
        n=sc.nextInt();  
        temp=n;  
        while(n>0)  
        {  
            int r = n%10;  
            sum = sum+r;  
            n = n/10;  
        }  
        System.out.println("Reverse of Number is:-" +sum);   
    }    
}  