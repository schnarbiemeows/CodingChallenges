package main;

import classes.Solution;

public class Main {

	/**
	 *
	 * difficulty - 
	 * description:
	 * Write an algorithm to determine if a number n is happy.
	 *
	 * A happy number is a number defined by the following process:
	 *
	 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
	 * Repeat the process until the number equals 1 (where it will stay),
	 * or it loops endlessly in a cycle which does not include 1.
	 * Those numbers for which this process ends in 1 are happy.
	 * Return true if n is a happy number, and false if not.
	 * constraints:
	 * 1 <= n <= 2^31 - 1		// MAX_VALUE , so no need for long
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		int thing = 2;
		System.out.println(sol.isHappy(thing));
	}

}
