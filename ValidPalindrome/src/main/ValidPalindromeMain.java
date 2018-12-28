package main;

import classes.Solution;

public class ValidPalindromeMain {

	/*
	 * difficulty - EASY
	 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
	 * Note: For the purpose of this problem, we define empty string as valid palindrome.
	 */
	public static void main(String[] args) {
		
		String input = "0P";
		Solution sol = new Solution();
		System.out.println(sol.isPalindrome(input));
	}

}
