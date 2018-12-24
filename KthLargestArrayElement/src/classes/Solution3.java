package classes;

import java.util.Arrays;

public class Solution3 {

	/*
	 * nlogn solution - this beats 71.27%	
	*/
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length-k];
	}
}
