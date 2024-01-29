package array;

public class Duplivate_Remove_Count {
	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		Printa.print(nums);
		System.out.println(removeDuplicates(nums));

	}
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; 
        int slowPointer = 0; 

        for (int fastPointer = 1; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != nums[slowPointer]) {
                // Found a new unique element
                uniqueCount++;
                slowPointer++;
                nums[slowPointer] = nums[fastPointer]; // Update slow pointer position
            }
        }
        Printa.print(nums);
        return uniqueCount;
    }
}