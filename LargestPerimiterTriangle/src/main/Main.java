package main;

import classes.Solution2;

public class Main {

	/*
	 * 976
	 * difficulty - EASY
	 * Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, 
	 * formed from 3 of these lengths.
	 * If it is impossible to form any triangle of non-zero area, return 0.
	 * 
	 */
	public static void main(String[] args) {
		int[] nums = {3,6,2,3};
		Solution2 sol = new Solution2();
		System.out.println(sol.largestPerimeter(nums));
	}

}
