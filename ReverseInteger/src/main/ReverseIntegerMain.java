package main;

import classes.Solution;

public class ReverseIntegerMain {

	/*
	 * difficulty - EASY
	 * Given a 32-bit signed integer, reverse digits of an integer.
	 * Note:
	 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range. 
	 * For the purpose of this problem, assume that your function returns 0 when the reversed integer 
	 * overflows.
	 */
	public static void main(String[] args) {
		int input = 123;
		Solution sol = new Solution();
		System.out.println(sol.reverse(input));
	}
}
