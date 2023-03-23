package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - 
	 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number
	 * sorted in non-decreasing order.
	 * 1 <= nums.length <= 104
	 * -104 <= nums[i] <= 104
	 */
	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		Solution2 sol = new Solution2();
		sol.sortedSquares(nums);
	}

}
