package main;

import classes.Solution;

public class Main {

	/*
	 * 953
	 * difficulty - EASY
	 *  In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. 
	 *  The order of the alphabet is some permutation of lowercase letters.
	 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the 
	 * given words are sorted lexicographicaly in this alien language.
	 * 
	 */
	public static void main(String[] args) {
		String[] words = {"apple","app"};
		String order = "abcdefghijklmnopqrstuvwxyz";
		Solution sol = new Solution();
		System.out.println(sol.isAlienSorted(words, order));
	}

}
