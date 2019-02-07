package main;

import classes.Solution;

public class Main {

	/*
	 * 917
	 * difficulty - EASY
	 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, 
	 * and all letters reverse their positions.
	 * 33 <= S[i].ASCIIcode <= 122
	 * S.length <= 100
	 * 
	 */
	public static void main(String[] args) {
		String s = "ghzAb";
		Solution sol = new Solution();
		System.out.println(s);
		System.out.println(sol.reverseOnlyLetters(s));
	}

}
