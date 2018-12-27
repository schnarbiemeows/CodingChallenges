package main;

import java.util.List;

import classes.Solution;

public class SelfDividingNumbersMain {

	/*
	 * difficulty - EASY
	 * A self-dividing number is a number that is divisible by every digit it contains.
	 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
	 * Also, a self-dividing number is not allowed to contain the digit zero.
	 * Given a lower and upper number bound, output a list of every possible self dividing number, 
	 * including the bounds if possible.
	 */
	public static void main(String[] args) {
		int left = 1,right =10000;
		Solution sol = new Solution();
		List<Integer> answer = sol.selfDividingNumbers(left, right);
		System.out.print("[");
		for(int i : answer) {
			System.out.print(i+",");
		}
		System.out.print("]");
	}

}
