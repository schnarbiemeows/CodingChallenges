package main;

import classes.Solution1;

public class Main1 {

	/*
	6204. Largest Positive Integer That Exists With Its Negative
	 * difficulty - EASY
	 * description:
	 * Given an integer array nums that does not contain any zeros, find the largest positive integer k
	 	such that -k also exists in the array.
	 	Return the positive integer k. If there is no such integer, return -1.
	 * constraints:
	 *	1 <= nums.length <= 1000
	 	-1000 <= nums[i] <= 1000
		nums[i] != 0
	 */
	public static void main(String[] args) {
		int[] nums = {-10,8,6,7,-2,-3};
		Solution1 sol = new Solution1();
		System.out.println(sol.findMaxK(nums));
	}

}
