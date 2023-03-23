package main;

import classes.Solution;

public class Main {

	private static void printArray(int[][] a) {
		for (int i = 0; i < a.length; ++i) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; a[i] != null && j < a[i].length; ++j) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*
	 * difficulty - EASY
	 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
	 */
	public static void main(String[] args) {


		/*System.out.println("Example I:");
		int[][] a = new int[2][5];
		printArray(a);
		System.out.println("Example II:");
		int[][] b = new int[2][];
		printArray(b);
		System.out.println("Example III:");
		b[0] = new int[3];
		b[1] = new int[5];
		printArray(b);*/
		int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		Solution sol = new Solution();
		int[] ans = sol.findDiagonalOrder(nums);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
