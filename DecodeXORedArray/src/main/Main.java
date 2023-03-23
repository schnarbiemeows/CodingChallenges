package main;

import classes.Solution;

public class Main {

	/**
	 * 1720
	 * difficulty - easy
	 * description:
	 * There is a hidden integer array arr that consists of n non-negative integers.
	 *
	 * It was encoded into another integer array encoded of length n - 1,
	 * such that encoded[i] = arr[i] XOR arr[i + 1].
	 * For example, if arr = [1,0,2,1], then encoded = [1,2,3].
	 *
	 * You are given the encoded array. You are also given an integer first,
	 * that is the first element of arr, i.e. arr[0].
	 *
	 * Return the original array arr. It can be proved that the answer exists and is unique.
	 * constraints:
	 * 2 <= n <= 104
	 * encoded.length == n - 1
	 * 0 <= encoded[i] <= 105
	 * 0 <= first <= 105
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = new int[]{1,2,3};
		int n = 1;
		int[] nnn = sol.decode(arr,n);
		for(int i=0;i<nnn.length;i++) {
			System.out.print(nnn[i]+",");
		}
	}

}
