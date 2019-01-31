package main;

import classes.Solution2;

public class Main {

	/*
	 * 566
	 * difficulty - EASY
	 * You're given a matrix represented by a two-dimensional array, and two positive integers r and c 
	 * representing the row number and column number of the wanted reshaped matrix, respectively.
	 * The reshaped matrix need to be filled with all the elements of the original matrix in the same 
	 * row-traversing order as they were.
	 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped 
	 * matrix; Otherwise, output the original matrix.
	 * 
	 */
	public static void main(String[] args) {
		int[][] nums = {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3}};
		Solution2 sol = new Solution2();
		int[][] answer = sol.matrixReshape(nums, 5, 3);
		for(int i=0;i<answer.length;i++) {
			System.out.print("[");
			for(int j=0;j<answer[0].length;j++) {
				System.out.print(answer[i][j]+", ");
			}
			System.out.println("]");
		}
	}

}
