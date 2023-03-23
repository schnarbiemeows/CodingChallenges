package main;

import classes.Solution;
import classes.Solution2;
import classes.WrongSolution;

public class Main {

	/*
	 * difficulty - EASY
	 * Given two binary strings a and b, return their sum as a binary string.
	 * 1 <= a.length, b.length <= 10^4
	 * a and b consist only of '0' or '1' characters.
	 * Each string does not contain leading zeros except for the zero itself.
	 */
	public static void main(String[] args) {
		//String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		//String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		String a = "1010";
		String b = "1011";
		WrongSolution sol = new WrongSolution();
		System.out.println(sol.addBinary(a,b));
	}

}
