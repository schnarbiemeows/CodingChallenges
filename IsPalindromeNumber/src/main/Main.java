package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - 
	 * 
	 */
	public static void main(String[] args) {
		int input = 2147483647;
		Solution2 sol = new Solution2();
		System.out.println(input + " = " + sol.isPalindrome(input));
		input = -1;
		System.out.println(input + " = " + sol.isPalindrome(input));
		input = 0;
		System.out.println(input + " = " + sol.isPalindrome(input));
		input = 8;
		System.out.println(input + " = " + sol.isPalindrome(input));
		input = 100;
		System.out.println(input + " = " + sol.isPalindrome(input));
		input = 123454321;
		System.out.println(input + " = " + sol.isPalindrome(input));
		input = 111111;
		System.out.println(input + " = " + sol.isPalindrome(input));
	}

}
