package main;

public class TwoSumMain {

	public static final int TARGET = 9;
	
	public static void main(String[] args) {
		/*
		 * Difficulty - EASY
		 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
		 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
		 */
		int[] myArray = {5,15,4,2,6};
		// my solution:
		Solution  solution = new Solution();
		int[] answer = solution.twoSum(myArray, TARGET);
		System.out.print("["+answer[0]+","+answer[1]+"]");
	}

}
