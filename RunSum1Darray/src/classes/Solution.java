package classes;

/*
 * start time = 1:42 - 1:47
 * end time = 1:47
 * total time =  5 minutes
 * speed = 46.23 %
 * memory = 55.35 %
 * notes:
 * i think these numbers are low just cause a ton of people submitted this
 */
public class Solution {
    public int[] runningSum(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++) {
            total += nums[i];
            nums[i] = total;
        }
        return nums;
    }
}
