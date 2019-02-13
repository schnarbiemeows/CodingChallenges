package main;

import classes.Solution;

public class Main {

	/*
	 * 812
	 * difficulty - EASY
	 * You have a list of points in the plane. Return the area of the largest triangle that can be formed by any 3 of the points.
	 * 
	 */
	public static void main(String[] args) {
		int[][] points = {{2,5},{7,7},{10,8},{10,10},{1,1}};
		Solution sol = new Solution();
		System.out.println(sol.largestTriangleArea(points));
	}

}
