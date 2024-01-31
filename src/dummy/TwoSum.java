package dummy;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (hm.containsKey(complement)) {
				return new int[]{hm.get(complement), i};
			}
		}

		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		// Example 1
		int[] nums1 = {2, 7, 11, 15};
		int target1 = 9;
		int[] result1 = twoSum(nums1, target1);
		System.out.println("Example 1: " + result1[0] + ", " + result1[1]);

		// Example 2
		int[] nums2 = {3, 2, 4};
		int target2 = 6;
		int[] result2 = twoSum(nums2, target2);
		System.out.println("Example 2: " + result2[0] + ", " + result2[1]);

		// Example 3
		int[] nums3 = {3, 3};
		int target3 = 6;
		int[] result3 = twoSum(nums3, target3);
		System.out.println("Example 3: " + result3[0] + ", " + result3[1]);
	}
}
