package main;

import classes.BestSolution;

public class Main {

	/*
	 * 136
	 * difficulty - EASY
	 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
	 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
	 */
	public static void main(String[] args) {
		int[] nums = {4,1,1,2,4};
		BestSolution sol = new BestSolution();
		System.out.println(sol.singleNumber(nums));
	}

}
