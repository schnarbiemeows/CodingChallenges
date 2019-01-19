package main;

import classes.Solution;

public class Main {

	/*
	 * 884
	 * difficulty - EASY
	 * We are given two sentences A and B.  (A sentence is a string of space separated words.  
	 * Each word consists only of lowercase letters.)
	 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the 
	 * other sentence.
	 * Return a list of all uncommon words. 
	 * You may return the list in any order.
	 */
	public static void main(String[] args) {
		String A = "apple apple";
		String B = "banana";
		Solution sol = new Solution();
		String[] answer = sol.uncommonFromSentences(A, B);
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+", ");
		}
	}

}
