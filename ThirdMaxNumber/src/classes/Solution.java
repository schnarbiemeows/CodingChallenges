package classes;

import java.util.Arrays;

/*
 * 11:50 - 12:22
 * speed = 25.10%
 * memory = 60.26%
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */
public class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int maxCount = 2;
        for(int i=nums.length-2;i>=0;i--) {
            if(nums[i]!=max) {
                max = nums[i];
                maxCount--;
            }
            if(maxCount==0) return max;
        }
        return nums[nums.length-1];
    }
}
