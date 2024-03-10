package lc;

import java.util.Arrays;

public class Candies {
	
    public static void main(String[] args) {
        int [] arr = { 1,0,2 };
        Printa.print(arr);
        
        function(arr);
    }

    
    public static void function(int[] ratings) {
        int [] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
    	
        for(int i=1;i<ratings.length-1;i++){
        	if( ratings[i]>ratings[i-1]){
        		candies[i] = candies[i-1]+1;
            }
        }

        
        for(int i=ratings.length-2; i>=0; i--){
        	if( ratings[i]>ratings[i+1]){
        		candies[i] = candies[i+1]+1;
            }
        }
        
        int num=0;
        for (int i : candies) {
			num = num+i;
		}
        System.out.println(num);
    }
    
}
