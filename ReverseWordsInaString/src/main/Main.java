package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - 
	 * description:
	 *	Given an input string s, reverse the order of the words.
	 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
	 * Return a string of the words in reverse order concatenated by a single space.
	 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
	 * The returned string should only have a single space separating the words. Do not include any extra spaces.
	 * constraints:
	 * 1 <= s.length <= 104
	 * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
	 * There is at least one word in s.
	 *
	 * ex:
	 * Input: s = "the sky is blue"
	 * Output: "blue is sky the"
	 */
	public static void main(String[] args) {
		String str = "a good   example";
		Solution2 sol = new Solution2();
		System.out.println(sol.reverseWords(str));
	}

}
