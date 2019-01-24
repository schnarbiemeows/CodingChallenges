package main;

import classes.Solution2;

public class Main {

	/*
	 * 868
	 * difficulty - EASY
	 * Given a positive integer N, find and return the longest distance between two consecutive 1's in the 
	 * binary representation of N.
	 * If there aren't two consecutive 1's, return 0.
	 */
	public static void main(String[] args) {
		int N = 33;
		Solution2 sol = new Solution2();
		System.out.println(sol.binaryGap(N));
	}

}
