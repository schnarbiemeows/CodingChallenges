package main;

import classes.Solution;

public class Main {

	/**
	 * 1389
	 * difficulty - easy
	 * description:
	 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
	 *
	 * Initially target array is empty.
	 * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
	 * Repeat the previous step until there are no elements to read in nums and index.
	 * Return the target array.
	 *
	 * It is guaranteed that the insertion operations will be valid.
	 * constraints:
	 * 1 <= nums.length, index.length <= 100
	 * nums.length == index.length
	 * 0 <= nums[i] <= 100
	 * 0 <= index[i] <= i
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		int[] target = sol.createTargetArray(nums,index);
		for(int i=0;i<target.length;i++) {
			System.out.print(target[i]+",");
		}
	}

}
