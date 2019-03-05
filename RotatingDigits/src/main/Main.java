package main;

import classes.Solution3;

public class Main {

	/*
	 * 788
	 * difficulty - EASY
	 * X is a good number if after rotating each digit individually by 180 degrees, we get a valid 
	 * number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.
	 * A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 
	 * 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not 
	 * rotate to any other number and become invalid.
	 * Now given a positive number N, how many numbers X from 1 to N are good?
	 */
	public static void main(String[] args) {
		int number = 10000;
		Solution3 sol = new Solution3();
		System.out.println(sol.rotatedDigits(number));
	}

}
