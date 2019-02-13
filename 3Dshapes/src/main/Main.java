package main;

import classes.Solution;

public class Main {

	/*
	 * 892
	 * difficulty - EASY
	 * On a N * N grid, we place some 1 * 1 * 1 cubes.
	 * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
	 * Return the total surface area of the resulting shapes.
	 * 
	 */
	public static void main(String[] args) {
		int[][] input = {{2,2,2},{2,1,2},{2,2,2}};
		Solution sol = new Solution();
		System.out.println(sol.surfaceArea(input));
	}

}
