package main;

import classes.Solution;

public class ToLowerCaseMain {

	/*
	 * difficulty - EASY
	 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
	 * 
	 * I just submitted the solution str.toLowerCase(), and it beat 32.10% of submissions
	 * here I am attempting to figure out what would would better/faster
	 * har, this second solution only beat 1.3% of all submissions!
	 * 
	 */
	public static void main(String[] args) {
		String str = "GJHKGHJKFTFkjftuyglhgHJGTUFGUPIY%*^R%^(YF&^F6fvUYG*&O*T679ifiUK^I(TYOGiky";
		Solution sol = new Solution();
		long start = System.currentTimeMillis();
		System.out.println(sol.toLowerCase(str));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		start = System.currentTimeMillis();
		System.out.println(str.toLowerCase());
		end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
