package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - MEDIUM
	 * description:
	 *	Given a string s, find the length of the longest substring without repeating characters.
	 * constraints:
	 * 0 <= s.length <= 5 * 10^4 (50000)
	 * s consists of English letters, digits, symbols and spaces.
	 */
	public static void main(String[] args) {

		Solution2 sol = new Solution2();
		String s = "";
		System.out.println(sol.lengthOfLongestSubstring(s)); 	// 0
		s = "abcabcbb";
		System.out.println(sol.lengthOfLongestSubstring(s));	// 3
		s = "bbbbb";
		System.out.println(sol.lengthOfLongestSubstring(s));	// 1
		s = "pwwkew";
		System.out.println(sol.lengthOfLongestSubstring(s));	// 3
		s = "abcabcd";
		System.out.println(sol.lengthOfLongestSubstring(s));	// 4
		s = " ";
		System.out.println(sol.lengthOfLongestSubstring(s));	// 1
		s = "dvdf";
		System.out.println(sol.lengthOfLongestSubstring(s));	// 3
	}

}
