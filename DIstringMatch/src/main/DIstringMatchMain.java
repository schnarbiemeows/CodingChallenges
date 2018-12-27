package main;

import classes.Solution;

public class DIstringMatchMain {

	/*
	 * difficulty - EASY
	 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
	 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
	 * If S[i] == "I", then A[i] < A[i+1]
	 * If S[i] == "D", then A[i] > A[i+1]
	 * example"
	 * Input: "IDID"
	 * Output: [0,4,1,3,2]
	 */
	public static void main(String[] args) {
		String input = "IDID";
		Solution sol = new Solution();
			
		int[] ans = sol.diStringMatch(input);
		System.out.print("[");
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
		System.out.println("]");
	}

}
