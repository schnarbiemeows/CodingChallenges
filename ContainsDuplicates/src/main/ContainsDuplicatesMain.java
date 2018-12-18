package main;

import classes.Solution;

public class ContainsDuplicatesMain {

	/*
	 * Given an array of integers and an integer k, find out whether there are two 
	 * distinct indices i and j in the array such that nums[i] = nums[j] and the absolute 
	 * difference between i and j is at most k.
	 * 
	 * hmm, ok, first submit accepted with no bugs, but I only beat 40.63% of submissions
	 */
	public static void main(String[] args) {
		int[] nums = {1,0,1,1};
		int k = 1;
		Solution sol = new Solution();
		System.out.println(sol.containsNearbyDuplicate(nums, k));
	}

}
