package main;

import classes.Solution;

public class Main {

	/*
	 * 283
	 * difficulty - EASY
	 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	 * You must do this in-place without making a copy of the array.
	 * Minimize the total number of operations.
	 */
	public static void main(String[] args) {
		int[] nums = {0,20,1};
		Solution sol = new Solution();
		sol.moveZeroes(nums);
		System.out.println("done");
	}

}
