package main;

import classes.Solution;

public class Main {

	/*
	 * 1013
	 * difficulty - EASY
	 * Given an array A of integers, return true if and only if we can partition the array into three 
	 * non-empty parts with equal sums.
	 * Formally, we can partition the array if we can find indexes i+1 < j with (A[0] + A[1] + ... + A[i] 
	 * == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])
	 * 
	 */
	public static void main(String[] args) {
		int[] input = {3,3,6,5,-2,2,5,1,-9,4};
		Solution sol = new Solution();
		System.out.println(sol.canThreePartsEqualSum(input));
	}

}
