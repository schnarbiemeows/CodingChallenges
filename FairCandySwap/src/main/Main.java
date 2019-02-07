package main;

import classes.Solution2;

public class Main {

	/*
	 * 888
	 * difficulty - EASY
	 * Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the 
	 * size of the j-th bar of candy that Bob has.
	 * Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same 
	 * total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
	 * Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of 
	 * the candy bar that Bob must exchange.
	 * If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
	 * 
	 */
	public static void main(String[] args) {
		int[] A = {2}, B = {1,3};
		Solution2 sol = new Solution2();
		int[] answer = sol.fairCandySwap(A, B);
		System.out.println("["+answer[0]+","+answer[1]+"]");
	}

}
