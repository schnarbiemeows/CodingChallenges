package main;

import classes.Solution;

public class Main {

	/*
	 * difficulty - EASY
	 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
	 * or -1 if needle is not part of haystack.
	 * 1 <= haystack.length, needle.length <= 104
	 * haystack and needle consist of only lowercase English characters.
	 */
	public static void main(String[] args) {
		String haystack = "dadbutsad";
		String needle = "dadbutsad";
		Solution sol = new Solution();
		System.out.println(sol.strStr(haystack,needle));
	}

}
