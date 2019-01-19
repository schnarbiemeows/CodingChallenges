package main;

import classes.Solution;

public class Main {

	/*
	 * difficulty - 
	 * 
	 */
	public static void main(String[] args) {
		String[] input = {"a","b","c","a","c","c"};
		Solution sol = new Solution();
		System.out.println(sol.numSpecialEquivGroups(input));
	}

}
