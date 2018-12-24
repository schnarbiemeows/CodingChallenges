package main;

import classes.Solution;

public class SortArrayByParityMain {

	/*
	 * difficulty - EASY
	 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, 
	 * followed by all the odd elements of A.
	 * You may return any answer array that satisfies this condition.
	 * Note:
	 * 1 <= A.length <= 5000
	 * 0 <= A[i] <= 5000
	 */
	public static void main(String[] args) {
		int[] input = {1,3,2,4};
		Solution sol = new Solution();
		int[] answer = sol.sortArrayByParity(input);
		for(int i : answer) {
			System.out.println(answer[i] + ", ");
		}

	}

}
