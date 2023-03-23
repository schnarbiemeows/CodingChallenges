package main;

import classes.Solution;

public class Main {

	/**
	 * 1281
	 * difficulty - easy
	 * description:
	 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
	 * constraints:
	 * 1 <= n <= 10^5			// so, max value could be 9*9*9*9*9 - 9*5 = 9^5, so no modulus
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		int num = 1;
		System.out.println(sol.subtractProductAndSum(num));
	}

}
