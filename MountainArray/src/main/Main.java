package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - EASY
	 * Given an array of integers arr, return true if and only if it is a valid mountain array.
	 * Recall that arr is a mountain array if and only if:
	 * arr.length >= 3
	 * There exists some i with 0 < i < arr.length - 1 such that:
	 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
	 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		Solution2 sol = new Solution2();
		System.out.println(sol.validMountainArray(arr));
	}

}
