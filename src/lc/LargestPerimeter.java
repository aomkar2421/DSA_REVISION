package lc;

import java.util.Arrays;

public class LargestPerimeter {
	public static void main(String[] args) {
		int [] arr = {1,12,1,2,5,50,3};
		find(arr);
	}

	private static void find(int[] nums) {
		
		// long sum = 0;
        // Arrays.sort(nums);
        // for (int num : nums) {
        //     sum += num;
        // }
        // int n = nums.length;
        // for (int i = n - 1; i >= 2; i--) {
        //     sum -= nums[i];
        //     if (sum > nums[i]) {
        //         return sum + nums[i];
        //     }
        // }
        // return -1;
		
		
		
		Arrays.sort(nums);
        int sum = 0;
        int ans = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (sum > nums[i]) {
                sum = sum + nums[i];
            }
        }
        System.out.println(sum);
	}
}
