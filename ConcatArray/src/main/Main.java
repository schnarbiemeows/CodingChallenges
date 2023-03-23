package main;

import classes.Solution;

public class Main {

	/*
	 * difficulty - EASY
	 * description:
	 *	Given an integer array nums of length n, you want to create an array ans of length 2n where
	 *  ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
	 * Specifically, ans is the concatenation of two nums arrays.
	 * Return the array ans.
	 * constraints:
	 * n == nums.length
	 * 1 <= n <= 1000
	 * 1 <= nums[i] <= 1000
	 */
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int[] nums = new int[]{0,2,1,5,3,4};
		int[] ans = sol.getConcatenation(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
		System.out.println();
		nums = new int[]{5,0,1,2,3,4};
		ans = sol.getConcatenation(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
		System.out.println();
		nums = new int[]{1,2,1};
		ans = sol.getConcatenation(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
		System.out.println();
		nums = new int[]{1,3,2,1};
		ans = sol.getConcatenation(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
		System.out.println();
		nums = new int[]{1};
		ans = sol.getConcatenation(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
	}

}
