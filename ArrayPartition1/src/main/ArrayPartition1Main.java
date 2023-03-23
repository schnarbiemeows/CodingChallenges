package main;

import classes.BestSolution;
import classes.Solution;
import classes.Solution2;

public class ArrayPartition1Main {

	/*
	 * difficulty - EASY
	 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, 
	 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
	 * n is a positive integer, which is in the range of [1, 10000].
	 * All the integers in the array will be in the range of [-10000, 10000].
	 */
	public static void main(String[] args) {
		int[] input = {1,4,3,2};
		BestSolution sol = new BestSolution();
		System.out.println(sol.arrayPairSum(input));
	}

}
