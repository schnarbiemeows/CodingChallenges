package main;

import classes.Solution;

public class Main {

	/*
	 * 35
	 * difficulty - EASY
	 * Given a sorted array and a target value, return the index if the target is found. If not, 
	 * return the index where it would be if it were inserted in order.
	 * You may assume no duplicates in the array.
	 */
	public static void main(String[] args) {
		int[] input = {1,3,5,6};
		int target = -1;
		Solution sol = new Solution();
		System.out.println(sol.searchInsert(input, target));
	}

}
