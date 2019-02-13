package main;

import classes.Solution;

public class Main {

	/*
	 * 896
	 * difficulty - EASY
	 * An array is monotonic if it is either monotone increasing or monotone decreasing.
	 * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
	 * Return true if and only if the given array A is monotonic.
	 * 
	 */
	public static void main(String[] args) {
		int[] input = {1,3,2,4};
		Solution sol = new Solution();
		System.out.println(sol.isMonotonic(input));
	}

}
