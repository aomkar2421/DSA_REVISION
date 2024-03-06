package lc;

public class RemoveDupli_1 {
	public static void main(String[] args) {
		int [] arr = {0,0,1,1,1,2,2,3,3,4};
		Printa.print(arr);
		method(arr);
	}
	
	public static void method(int[] nums) {
        int j =0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j] = nums[nums.length-1];
        j++;

		Printa.print(nums);
    }
}
