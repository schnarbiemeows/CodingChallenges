package main;

import classes.Solution;

public class JewelsAndStonesMain {

	/*
	 * difficulty - EASY
	 * You're given strings J representing the types of stones that are jewels, 
	 * and S representing the stones you have.  Each character in S is a type of 
	 * stone you have.  You want to know how many of the stones you have are also jewels.
	 * The letters in J are guaranteed distinct, and all characters in J and S are 
	 * letters. Letters are case sensitive, so "a" is considered a different type of 
	 * stone from "A"
	 * 
	 * WOOT - 1st submission, no fails, beat 92.12% of submissions!
	 */
	public static void main(String[] args) {
		String J = "z";
		String S = "ZZZ";
		Solution mySolution = new Solution();
		System.out.println(mySolution.numJewelsInStones(J, S));

	}

}
