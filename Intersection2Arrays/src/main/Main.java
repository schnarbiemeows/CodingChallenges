package main;

import classes.Solution2;

public class Main {

	/*
	 * 349
	 * difficulty - EASY
	 * Given two arrays, write a function to compute their intersection.
	 */
	public static void main(String[] args) {
		int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
		Solution2 sol = new Solution2();
		int[] answer = sol.intersection(nums1, nums2);
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" , ");
		}
	}

}
