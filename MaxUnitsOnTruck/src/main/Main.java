package main;

import classes.Solution;

import java.sql.SQLOutput;

public class Main {

	/*
	 * difficulty - 
	 * 
	 */
	public static void main(String[] args) {
		int[][] boxTypes = {{1,3},{2,2},{3,1}};
		int truckSize = 4;
		Solution sol = new Solution();
		System.out.println(sol.maximumUnits(boxTypes,truckSize));
	}

}
