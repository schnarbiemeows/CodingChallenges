package main;

import classes.Solution2;

public class Main {

	/*
	 * 575
	 * difficulty - EASY
	 * Given an integer array with even length, where different numbers in this array represent different 
	 * kinds of candies. Each number means one candy of the corresponding kind. You need to distribute 
	 * these candies equally in number to brother and sister. Return the maximum number of kinds of candies 
	 * the sister could gain.
	 */
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,3,1};
		Solution2 sol = new Solution2();
		System.out.println(sol.distributeCandies(nums));
	}

}
