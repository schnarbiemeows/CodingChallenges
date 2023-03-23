package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - EASY
	 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
	 * The relative order of the elements may be changed.
	 * Since it is impossible to change the length of the array in some languages,
	 * you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
	 * then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
	 * Return k after placing the final result in the first k slots of nums.
	 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
	 */
	public static void main(String[] args) {

		int[] nums = {2,2,2,3,4};
		int val = 2;
		Solution2 sol = new Solution2();
		System.out.println(sol.removeElement(nums,val));
	}

}
