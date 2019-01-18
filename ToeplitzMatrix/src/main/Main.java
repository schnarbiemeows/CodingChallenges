package main;

import classes.Solution;

public class Main {

	/*
	 * 766
	 * difficulty - EASY
	 * A matrix is Toeplitz if every diagonal from top-left to 
	 * bottom-right has the same element.
	 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
	 * 
	 */
	public static void main(String[] args) {
		int[][] input = { {1,2,3,4},{5,1,2,3},{9,5,1,2}};
		Solution sol = new Solution();
		System.out.println(sol.isToeplitzMatrix(input));
	}

}
