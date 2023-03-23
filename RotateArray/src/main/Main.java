package main;

import classes.Solution;
import classes.Solution2;
import classes.Solution3;

public class Main {

	/*
	 * difficulty - MEDIUM
	 * Given an array, rotate the array to the right by k steps, where k is non-negative.
	 * 1 <= nums.length <= 105
	 * -231 <= nums[i] <= 231 - 1
	 * 0 <= k <= 105
	 */
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 0;
		Solution3 sol = new Solution3();
		sol.rotate(nums,k);
	}

}
