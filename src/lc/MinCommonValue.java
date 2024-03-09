package lc;

public class MinCommonValue {
	public static void main(String[] args) {

		int [] arr1 = {1,2,3,4};
		int [] arr2 = {5,6,7};
		getCommon(arr1, arr2);

	}

	public static void getCommon(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		
		while (i<nums1.length && j<nums2.length) {
			if (nums1[i] < nums2[j]) {
				i++;
			}
			else if (nums1[i] > nums2[j]) {
				j++;
			}
			else if (nums1[i] == nums2[j]) {
				System.out.println(nums1[i]);
				return;
			}
		}
		System.out.println("No Common Elemnet");
	}

}
