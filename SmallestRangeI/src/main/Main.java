package main;

import classes.Solution;

public class Main {

	/*
	 * difficulty - EASY
	 * Given an array A of integers, for each integer A[i] we may choose any x with 
	 * -K <= x <= K, and add x to A[i].
	 * After this process, we have some array B.
	 * Return the smallest possible difference between the maximum value of B and 
	 * the minimum value of B.
	 * 
	 */
	public static void main(String[] args) {
		int[] input = {1,3,6,9,10,11,12,13,14,15,16,67};
		int K = 3;
		Solution sol = new Solution();
		System.out.println(sol.smallestRangeI(input, K));
	}

}
