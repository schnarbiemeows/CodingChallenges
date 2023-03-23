package main;

import classes.Solution;
import classes.Solution3;

public class Main {

	/*
	 * difficulty - EASY
	 * Write a function to find the longest common prefix string amongst an array of strings.
	 * If there is no common prefix, return an empty string "".
	 * 1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
	 */
	public static void main(String[] args) {
		String[] strs = { "","aracecar","acar"};
		Solution3 sol = new Solution3();
		System.out.println(sol.longestCommonPrefix(strs));
		//System.out.println("rabbit".startsWith(""));
	}

}
