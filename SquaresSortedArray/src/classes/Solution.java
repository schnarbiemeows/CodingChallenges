package classes;

import java.util.Arrays;

/*
 * 12:59 - 1:00(already done this one)
 * speed = 24.58%
 * memory = 63.21%
 * trick here is that negatives turn to positives when squared
 */
public class Solution {
    public int[] sortedSquares(int[] nums) {

        for(int i=0;i<nums.length;i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
