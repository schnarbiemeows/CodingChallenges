package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - EASY
	 * description:
	 * Given an integer n, return true if and only if it is an Armstrong number.
	 * The k-digit number n is an Armstrong number if and only if the kth power of each digit sums to n.
	 * constraints:
	 * 1 <= n <= 10^8	(NOT larger than MAX_INT) 100 000 000 2,147,483,647 1,000,000,000
	 */
	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();
		int n = 153;
		System.out.println(sol.isArmstrong(n));
		n = 123;
		System.out.println(sol.isArmstrong(n));
	}

}
