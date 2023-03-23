package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
		2299
	 * difficulty - EASY
	 * description:
	 *	A password is said to be strong if it satisfies all the following criteria:
	 It has at least 8 characters.
	It contains at least one lowercase letter.
It contains at least one uppercase letter.
It contains at least one digit.
It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
Given a string password, return true if it is a strong password. Otherwise, return false.
	 * constraints:
	 *
	 */
	public static void main(String[] args) {
		String pwd = "abc";
		Solution2 sol = new Solution2();
		System.out.println(sol.strongPasswordCheckerII(pwd)); // false
		pwd = "abcdefghjkiol";
		System.out.println(sol.strongPasswordCheckerII(pwd)); // false
		pwd = "aB5$djfhdskjfhksdhf";
		System.out.println(sol.strongPasswordCheckerII(pwd)); // true
		pwd = "aB4$oooooooooo";
		System.out.println(sol.strongPasswordCheckerII(pwd)); //false
		pwd = "aA$56tuvl";
		System.out.println(sol.strongPasswordCheckerII(pwd)); // true
	}

}
