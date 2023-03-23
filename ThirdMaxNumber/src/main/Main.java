package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - EASY
	 * Given an integer array nums, return the third distinct maximum number in this array.
	 * If the third maximum does not exist, return the maximum number.
	 */
	public static void main(String[] args) {
		int[] nums = {1,0,0,2,3};
		Solution2 sol = new Solution2();
		System.out.println(sol.thirdMax(nums));
	}

}
