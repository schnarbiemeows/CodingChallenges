package main;

import classes.Solution;

public class Main {

	/*
	 * 
	 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.
	 */
	public static void main(String[] args) {
		int[] input = {5,1,5,2,5,3,5,4};
		Solution sol = new Solution();
		System.out.println(sol.repeatedNTimes(input));

	}

}
