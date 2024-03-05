//238. Product of Array Except Self

package lc;

import array.print;

public class Leetcode_238 {
	public static void main(String[] args) {
		 int [] arr = {-1,1,0,-3,3};
		 productExceptSelf(arr);
	}
	
	public static void productExceptSelf(int[] nums) {
        int ans = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0)
            ans = ans * nums[i];
        }
        Printa.print(nums);
        System.out.println(ans);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[i] = ans;
            }
            if(nums[i] != 0){
                nums[i] = ans/nums[i];
            }else{
                nums[i] = 0;
            }
        }
        
        Printa.print(nums);
    }
	
}
