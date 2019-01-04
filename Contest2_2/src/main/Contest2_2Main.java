package main;

import classes.Solution;

public class Contest2_2Main {

	/*
	 * difficulty - MEDIUM
	 * Return all non-negative integers of length N such that the absolute difference between every two consecutive 
	 * digits is K.
	 * Note that every number in the answer must not have leading zeros except for the number 0 itself. For example, 
	 * 01 has one leading zero and is invalid, but 0 is valid.
	 * You may return the answer in any order.
	 * Note:
	 * 1 <= N <= 9
	 * 0 <= K <= 9
	 */
	public static void main(String[] args) {
		int N = 9;
		int K = 2;
		Solution sol = new Solution();
		int[] answer = sol.numsSameConsecDiff(N, K);
		System.out.print("[");
		for(int item : answer) {
			System.out.print(item+",");
		}
		System.out.println("]");
	}

}
