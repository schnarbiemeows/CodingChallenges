package main;

import classes.Solution;

public class Main {

	/*
		1480
	 * difficulty - easy
	 * description:
	 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
	 	Return the running sum of nums.
	 * constraints:
	 *	1 <= nums.length <= 1000
		-10^6 <= nums[i] <= 10^6	= 1000000 * 1000
	 */
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int[] nums = new int[]{1,2,3,4};
		sol.runningSum(nums);
		nums = new int[]{1,1,1,1,1};
		sol.runningSum(nums);
		nums = new int[]{3,1,2,10,1};
		sol.runningSum(nums);
		nums = new int[]{3};
		sol.runningSum(nums);
	}

}
