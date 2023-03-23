package main;

import classes.Solution;

public class Main {

	/*
		2011
	 * difficulty - easy
	 * description:
	 *	There is a programming language with only four operations and one variable X:
	 ++X and X++ increments the value of the variable X by 1.
	 --X and X-- decrements the value of the variable X by 1.
	 Initially, the value of X is 0.
	 Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
	 initially the variable = 0
	 * constraints:
	 *	1 <= operations.length <= 100
	 operations[i] will be either "++X", "X++", "--X", or "X--".
	 */
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		String[] ops = new String[]{"--X","X++","X++"};
		System.out.println(sol.finalValueAfterOperations(ops));
		ops = new String[]{"++X","++X","X++"};
		System.out.println(sol.finalValueAfterOperations(ops));
		ops = new String[]{"X++","++X","--X","X--"};
		System.out.println(sol.finalValueAfterOperations(ops));
	}

}
