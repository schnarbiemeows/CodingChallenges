package main;

import classes.Solution;

public class Main {

	/*
	 * difficulty - EASY
	 * description:
	 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where
	 * ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
	 * 	A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
	 * constraints:
	 * 1 <= nums.length <= 1000
	 * 0 <= nums[i] < nums.length
	 * The elements in nums are distinct.
	 */
	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] nums = new int[]{0,2,1,5,3,4};
		int[] ans = sol.buildArray(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
		System.out.println();
		nums = new int[]{5,0,1,2,3,4};
		ans = sol.buildArray(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
		System.out.println();
		nums = new int[]{0};
		ans = sol.buildArray(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
	}

}
