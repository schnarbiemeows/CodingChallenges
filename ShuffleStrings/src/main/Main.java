package main;

import classes.Solution;

public class Main {

	/**
	 * 1528
	 * difficulty - easy
	 * description:
	 * You are given a string s and an integer array indices of the same length.
	 * The string s will be shuffled such that the character at the ith position
	 * moves to indices[i] in the shuffled string.
	 *
	 * Return the shuffled string.
	 * constraints:
	 * s.length == indices.length == n
	 * 1 <= n <= 100
	 * s consists of only lowercase English letters.
	 * 0 <= indices[i] < n
	 * All values of indices are unique.
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		String s = "abc";
		int[] indices = new int[]{0,1,2};
		System.out.println(sol.restoreString(s,indices));
	}

}
