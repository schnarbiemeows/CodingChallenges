package main;

import classes.Solution;

public class Main {

	/*
	 * Given a set of points in the xy-plane, determine the minimum area of any rectangle formed from these points, 
	 * with sides not necessarily parallel to the x and y axes.
	 * If there isn't any rectangle, return 0.
	 */
	public static void main(String[] args) {
		int[][] input = new int[10][2] ;
		input[0][0] = 1;
		input[0][1] = 0;
		input[1][0] = 0;
		input[1][1] = 1;
		input[2][0] = 2;
		input[2][1] = 6;
		input[3][0] = 2;
		input[3][1] = 1;
		input[4][0] = 3;
		input[4][1] = 5;
		input[5][0] = 5;
		input[5][1] = 4;
		input[6][0] = 5;
		input[6][1] = 1;
		input[7][0] = 7;
		input[7][1] = 6;
		input[8][0] = 7;
		input[8][1] = 1;
		input[9][0] = 5;
		input[9][1] = 6;
		Solution sol = new Solution();
		System.out.println(sol.minAreaFreeRect(input));

	}

}

/*
Input: [[1,2],[2,1],[1,0],[0,1]]
Output: 2.00000
Explanation: The minimum area rectangle occurs at [1,2],[2,1],[1,0],[0,1], with an area of 2.

Input: [[0,1],[2,1],[1,1],[1,0],[2,0]]
Output: 1.00000
Explanation: The minimum area rectangle occurs at [1,0],[1,1],[2,1],[2,0], with an area of 1.

Input: [[0,3],[1,2],[3,1],[1,3],[2,1]]
Output: 0
Explanation: There is no possible rectangle to form from these points.

Input: [[3,1],[1,1],[0,1],[2,1],[3,3],[3,2],[0,2],[2,3]]
Output: 2.00000
Explanation: The minimum area rectangle occurs at [2,1],[2,3],[3,3],[3,1], with an area of 2.

1 <= points.length <= 50
0 <= points[i][0] <= 40000
0 <= points[i][1] <= 40000
All points are distinct.
Answers within 10^-5 of the actual value will be accepted as correct.

*/