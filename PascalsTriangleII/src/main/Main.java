package main;

import classes.Solution;

public class Main {

	/*
	 * difficulty - 
	 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
	 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
	 * 0 <= rowIndex <= 33
	 */
	public static void main(String[] args) {
		int rowIndex = 1;
		Solution sol = new Solution();
		for(int i = 0;i<=33;i++) {
			rowIndex = i;
			System.out.println(sol.getRow(rowIndex));
		}

	}

}
