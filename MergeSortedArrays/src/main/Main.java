package main;

import classes.Solution;

public class Main {

	/*
	 * difficulty - EASY
	 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
	 * representing the number of elements in nums1 and nums2 respectively.
	 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
	 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
	 * To accommodate this, nums1 has a length of m + n,
	 * where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
	 * 
	 */
	public static void main(String[] args) {

		int[] nums1 = {4,0,0,0};
		int[] nums2 = {5,7,8};
		int n = 3;
		int m = 1;
		Solution sol = new Solution();
		sol.merge(nums1,m,nums2,n);
		for(int i = 0; i< nums1.length; i++) {
			System.out.print(nums1[i]+" ");
		}
	}

}
