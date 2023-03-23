package main;

import classes.Solution;

public class Main {

	/**
	 * 1431
	 * difficulty - easy
	 * description:
	 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents
	 * the number of candies the ith kid has, and an integer extraCandies,
	 * denoting the number of extra candies that you have.
	 *
	 * Return a boolean array result of length n, where result[i] is true if,
	 * after giving the ith kid all the extraCandies,
	 * they will have the greatest number of candies among all the kids, or false otherwise.
	 *
	 * Note that multiple kids can have the greatest number of candies.
	 * constraints:
	 * n == candies.length
	 * 2 <= n <= 100
	 * 1 <= candies[i] <= 100
	 * 1 <= extraCandies <= 50
	 */
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int extra = 3;
		int[] candies = {2,3,5,1,3};
		sol.kidsWithCandies(candies,extra);
	}

}
