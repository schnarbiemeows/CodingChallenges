package main;

import java.util.List;

import classes.Solution;

public class FindKpairsMain {

	/*
	 * You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
	 * Define a pair (u,v) which consists of one element from the first array and one element from the second array.	
	 * Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.
	 */
	public static void main(String[] args) {
		int[] nums1 = {};
		int[] nums2 = {2,3,6,8,10};
		int k = 2;
		Solution sol = new Solution();
		List<int[]> answer = sol.kSmallestPairs(nums1, nums2, k);
		for(int[] item : answer) {
			System.out.print("[" + item[0] + "," + item[1] + "],");
		}
	}

}
// [1,8],[5,3],[5,2],[1,6],[4,3],[4,2],[1,3],[1,2]
// [1,2],[1,3],[4,2],[5,2],[1,6],[4,3],[5,3],[1,8]