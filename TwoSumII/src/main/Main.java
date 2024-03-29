package main;

import classes.Solution;

public class Main {

	/*
	 * difficulty - EASY
	 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers
	 * such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2]
	 * where 1 <= index1 < index2 <= numbers.length.
	 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2]
	 * of length 2.
	 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
	 * Your solution must use only constant extra space.
	 * 2 <= numbers.length <= 3 * 104
	 * -1000 <= numbers[i] <= 1000
	 * numbers is sorted in non-decreasing order.
	 * -1000 <= target <= 1000
	 */
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		Solution sol = new Solution();
		int[] ans = sol.twoSum(nums,target);
		System.out.println("i = " + ans[0] + " , j = " + ans[1]);
	}

}
