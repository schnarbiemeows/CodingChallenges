package main;

import classes.Solution;
import classes.Solution2;

import java.util.List;

public class Main {

	/*
	 * difficulty - MEDIUM
	 * Given an m x n matrix, return all elements of the matrix in spiral order.
	 */
	public static void main(String[] args) {
		//int[][] arr = {{6,9,7}};
		//int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr = {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
		Solution2 sol = new Solution2();
		List<Integer> ans = sol.spiralOrder(arr);
		for(int i : ans) {
			System.out.print(i + " ");
		}
	}

}
