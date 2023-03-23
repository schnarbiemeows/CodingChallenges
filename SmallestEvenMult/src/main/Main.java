package main;

import classes.Solution;

public class Main {

	/**
	 * 2413
	 * difficulty - easy
	 * description:
	 * Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
	 * constraints:
	 * 1 <= n <= 150
	 */
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		for(int i=1;i<=150;i++) {
			System.out.println("i = " + i + " , " + sol.smallestEvenMultiple(i));
		}

	}

}
