package main;

import classes.Solution;

public class KthLargestArrayElementMain {

	/* 
	 * difficulty - MEDIUM
	 * Find the kth largest element in an unsorted array. 
	 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
	 */
	public static void main(String[] args) {
		int[] input = {3};
		int k = 1;
		Solution sol = new Solution();
		System.out.println(sol.findKthLargest(input, k));

	}

}
