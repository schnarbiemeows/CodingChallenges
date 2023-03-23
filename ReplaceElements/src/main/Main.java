package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - EASY
	 * Given an array arr, replace every element in that array with the greatest element among
	 * the elements to its right, and replace the last element with -1.
	 * After doing so, return the array.
	 * 1 <= arr.length <= 104
	 * 1 <= arr[i] <= 105
	 */
	public static void main(String[] args) {
		int[] arr = {17,17,4,5,1,2,16};
		Solution2 sol = new Solution2();
		System.out.println(sol.replaceElements(arr));
	}

}
