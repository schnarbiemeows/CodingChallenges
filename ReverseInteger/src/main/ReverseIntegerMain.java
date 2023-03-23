package main;

import classes.Solution;
import classes.Solution2;

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
		//  -2147483648 to 2147483647.
		int input = 1234567899;
		Solution2 sol = new Solution2();
		System.out.println(input + " - " + sol.reverse(input));
		input = -123;
		System.out.println(input + " - " + sol.reverse(input));
		input = -1234567899;
		System.out.println(input + " - " + sol.reverse(input));
		input = 1234567899;
		System.out.println(input + " - " + sol.reverse(input));
		input = 0;
		System.out.println(input + " - " + sol.reverse(input));
		input = 9;
		System.out.println(input + " - " + sol.reverse(input));
	}
}
