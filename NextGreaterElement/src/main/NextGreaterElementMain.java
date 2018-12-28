package main;

import classes.Solution;

public class NextGreaterElementMain {

	/* 496
	 * difficulty - EASY
	 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. 
	 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
	 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. 
	 * If it does not exist, output -1 for this number.
	 */
	public static void main(String[] args) {
		int[] arr1 = {};
		int[] arr2 = {1,2,3,4};
		Solution sol = new Solution();
		int[] answers = sol.nextGreaterElement(arr1, arr2);
		for(int i : answers) {
			System.out.print(i + ", ");
		}

	}

}
