package main;

import classes.Solution;

import java.util.List;

public class Main {

	/*
	 * difficulty - 
	 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in
	 * the range [1, n] that do not appear in nums.
	 * n == nums.length
	 * 1 <= n <= 10^5
	 * 1 <= nums[i] <= n
	 */
	public static void main(String[] args) {
		int[] nums = {1};
		Solution sol = new Solution();
		List<Integer> results = sol.findDisappearedNumbers(nums);
		for(Integer i : results) {
			System.out.print(i + " ");
		}
	}

}
