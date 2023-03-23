package main;

import classes.Solution2;

/**
 * difficulty - EASY
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */
public class Main2 {
    public static void main(String[] args) {
        int[] arr = {1,0};
        Solution2 sol = new Solution2();
        sol.moveZeroes(arr);
    }
}
