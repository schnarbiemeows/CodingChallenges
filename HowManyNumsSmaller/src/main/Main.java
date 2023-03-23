package main;

import classes.Solution;

public class Main {

	/**
	 * 1365
	 * difficulty - easy
	 * description:
	 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
	 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
	 *
	 * Return the answer in an array.
	 * constraints:
	 *
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = new int[]{6,5,4,8};
		int[] ans = sol.smallerNumbersThanCurrent(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}

	}

}
