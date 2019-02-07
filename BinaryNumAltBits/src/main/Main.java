package main;

import classes.Solution2;

public class Main {

	/*
	 * 693
	 * difficulty - EASY
	 * 
	 * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
	 */
	public static void main(String[] args) {
		int num = 5;
		Solution2 sol = new Solution2();
		System.out.println(sol.hasAlternatingBits(num));
	}

}
