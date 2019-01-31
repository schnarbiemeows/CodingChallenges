package main;

import classes.Solution;

public class Main {

	/*
	 * 191
	 * difficulty - EASY
	 * Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).
	 */
	public static void main(String[] args) {
		int n = 8;
		Solution sol = new Solution();
		System.out.println(sol.hammingWeight(n));
	}

}
