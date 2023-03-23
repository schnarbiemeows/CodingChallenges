package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/**
	 * 1909
	 * difficulty - 
	 * description:
	 * Given a 0-indexed integer array nums, return true if it can be made strictly increasing after
	 * removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.
	 *
	 * The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).
	 * constraints:
	 * 2 <= nums.length <= 1000
	 * 1 <= nums[i] <= 1000				// no negative #s!
	 */
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] nums = {10,2,3,4,4,7};
		System.out.println(sol.canBeIncreasing(nums));
	}

}
