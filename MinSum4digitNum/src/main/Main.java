package main;

import classes.Solution;

public class Main {

	/**
	 * 2160
	 * difficulty - EASY
	 * description:
	 * You are given a positive integer num consisting of exactly four digits.
	 * Split num into two new integers new1 and new2 by using the digits found in num.
	 * Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
	 *
	 * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3.
	 * Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
	 * Return the minimum possible sum of new1 and new2.
	 * constraints:
	 * 1000 <= num <= 9999
	 */
	public static void main(String[] args) {
		int j = 9876;
		Solution sol = new Solution();
		sol.minimumSum(j);
		for(int i=1000;i<10000;i++) {
			sol.minimumSum(i);
		}
	}

}
