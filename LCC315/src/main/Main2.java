package main;

import classes.Solution2;

/**
 * 6205. Count Number of Distinct Integers After Reverse Operations
 * difficulty - MEDIUM
 * You are given an array nums consisting of positive integers.
 * You have to take each integer in the array, reverse its digits, and add it to the end of the array.
 * You should apply this operation to the original integers in nums.
 * Return the number of distinct integers in the final array.
 */
public class Main2 {


    public static void main(String[] args) {
        int[] nums = { 2,2,2 };
        Solution2 sol = new Solution2();
        System.out.println(sol.countDistinctIntegers(nums));
    }
}
