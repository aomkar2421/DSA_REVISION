package lc;

import java.util.Arrays;

public class LargestPerimeter {
	public static void main(String[] args) {
		int [] arr = {1,12,1,2,5,50,3};
		find(arr);
	}

	private static void find(int[] nums) {
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
