package main;

import classes.Solution;

public class BaseBallGameMain {

	/*
	 * Ha! first submission, no fails, beat 86.71% of the tests!
	 * see : https://leetcode.com/problems/baseball-game/description/
	 * for description of the game
	 */
	public static void main(String[] args) {
		
		String[] input = {"+"};
		Solution sol = new Solution();
		System.out.println(sol.calPoints(input));
	}

}
