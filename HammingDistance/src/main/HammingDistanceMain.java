package main;

import classes.Solution;

public class HammingDistanceMain {

	/*
	 * difficulty - EASY
	 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
	 * Given two integers x and y, calculate the Hamming distance.
	 * Note:
	 * 0 <= x < 2^31
	 */
	public static void main(String[] args) {
		int x = 0;
		int y = 8;
		Solution sol = new Solution();
		System.out.println(sol.hammingDistance(x, y));

	}

}
