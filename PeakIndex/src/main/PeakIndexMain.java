package main;

import classes.Solution;

public class PeakIndexMain {

	/*
	 * difficulty - EASY
	 * Let's call an array A a mountain if the following properties hold:
	 * A.length >= 3
	 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > 
	 * A[i+1] > ... > A[A.length - 1]
	 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < 
	 * A[i] > A[i+1] > ... > A[A.length - 1].
	 */
	public static void main(String[] args) {
		int[] input = {0,1,0};
		Solution sol = new Solution();
		System.out.println(sol.peakIndexInMountainArray(input));
	}

}
