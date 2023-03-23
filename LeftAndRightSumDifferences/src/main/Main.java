package main;

import classes.Solution;

public class Main {

	/**
	 * 2574
	 * difficulty - EASY
	 * description:
	 * Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
	 *
	 * answer.length == nums.length.
	 * answer[i] = |leftSum[i] - rightSum[i]|.
	 * Where:
	 *
	 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
	 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
	 * Return the array answer.
	 * constraints:
	 * 1 <= nums.length <= 1000
	 * 1 <= nums[i] <= 105
	 */
	public static void main(String[] args) {
		int[] nums = {-1,2,3,4,5};
		Solution sol = new Solution();
		int[] ans = sol.leftRigthDifference(nums);
		for(int i : ans) {
			System.out.print(i + ", ");
		}
	}

}
