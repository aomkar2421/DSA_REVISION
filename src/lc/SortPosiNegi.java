package lc;

public class SortPosiNegi {
	public static void main(String[] args) {
		int arr [] = {3,1,-2,-5,2,-4};
		rearrangeArray(arr);
	}
	
	public static void rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length];

        int j = 0, k = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[j] = nums[i];
                j += 2;
            } else {
                arr[k] = nums[i];
                k += 2;
            }
        }

        Printa.print(arr);
    }
}
