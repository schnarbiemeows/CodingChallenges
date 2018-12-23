package main;

import classes.Solution;

public class Main {

	/*
	 * 
	 * Given an array A of integers, a ramp is a tuple (i, j) for which i < j and A[i] <= A[j].  The width of such a ramp is j - i.

Find the maximum width of a ramp in A.  If one doesn't exist, return 0.
	 */
	public static void main(String[] args) {
		int[] input = {9,8,1,0,1,9,4,0,4,1};
		Solution sol = new Solution();
		System.out.println(sol.maxWidthRamp(input));

	}

}
