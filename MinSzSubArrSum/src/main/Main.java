package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - MEDIUM
	 *
	 * 									I couldn't do this one, it kept timing out
	 *
	 * Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous
	 *  subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target.
	 * If there is no such subarray, return 0 instead.
	 *
	 * 1 <= target <= 10^9
	 * 1 <= nums.length <= 10^5				VERY LARGE SET
	 * 1 <= nums[i] <= 10^4
	 */
	public static void main(String[] args) {
		int[] nums = {1,1,1,1,1,1,1,1};
		int tar = 11;
		Solution2 sol = new Solution2();
		System.out.println(sol.minSubArrayLen(tar,nums));
	}

}
