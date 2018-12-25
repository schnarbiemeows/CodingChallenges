package main;

import classes.Solution2;

public class FlippingImageMain {

	/*
	 * difficulty - EASY
	 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
	 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] 
	 * horizontally results in [0, 1, 1].
	 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, 
	 * inverting [0, 1, 1] results in [1, 0, 0]
	 * note:
	 * 1 <= A.length = A[0].length <= 20
	 * 0 <= A[i][j] <= 1
	 */
	public static void main(String[] args) {
		int[][] input = new int[4][4];
		input[0][0] = 1;
		input[0][1] = 1;
		input[0][2] = 0;
		input[0][3] = 0;
		input[1][0] = 1;
		input[1][1] = 0;
		input[1][2] = 0;
		input[1][3] = 1;
		input[2][0] = 0;
		input[2][1] = 1;
		input[2][2] = 1;
		input[2][3] = 1;
		input[3][0] = 1;
		input[3][1] = 0;
		input[3][2] = 1;
		input[3][3] = 0;
		/*input[0][0] = 0;
		input[1][0] = 1;*/
		
		Solution2 sol = new Solution2();
		int[][] output = sol.flipAndInvertImage(input);
		for(int i=0;i<output.length;i++) {
			System.out.print("["+output[i][0]+","+output[i][1]+","+output[i][2]+","+output[i][3]+"],");
		}
	}

}
