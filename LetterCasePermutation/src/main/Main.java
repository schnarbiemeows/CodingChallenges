package main;

import java.util.List;

import classes.Solution;

public class Main {

	/*
	 * 784
	 * difficulty - EASY
	 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  
	 * Return a list of all possible strings we could create.
	 * 
	 */
	public static void main(String[] args) {
		String S = "abcdefghijkl";
		Solution sol = new Solution();
		List<String> answer = sol.letterCasePermutation(S);
		for(String s : answer) {
			System.out.println(s);
		}
	}

}
