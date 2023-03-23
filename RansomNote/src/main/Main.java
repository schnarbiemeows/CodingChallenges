package main;

import classes.Solution;

public class Main {

	/*
		start = 6:07
		6:16
	 * difficulty - EASY
	 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
		Each letter in magazine can only be used once in ransomNote.
	 */
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		System.out.println(sol.canConstruct("aa","ab"));
		System.out.println(sol.canConstruct("aa",""));
		System.out.println(sol.canConstruct("a","b"));
		System.out.println(sol.canConstruct("aa","aab"));
	}

}
