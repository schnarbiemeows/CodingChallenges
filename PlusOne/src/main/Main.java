package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - 
	 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of
	 * the integer. The digits are ordered from most significant to least significant in left-to-right order. The large
	 * integer does not contain any leading 0's.Increment the large integer by one and return the resulting array of digits.
	 */
	public static void main(String[] args) {
		int[] arr = {1};
		Solution2 sol = new Solution2();
		int[] ans = sol.plusOne(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
