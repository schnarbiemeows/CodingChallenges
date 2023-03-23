package classes;

import java.util.Arrays;

public class Solution2 {
    public int minSubArrayLen(int target, int[] nums) {
        int[] nums2 = new int[nums.length];
        for(int k=0;k<nums.length;k++) {
            if(nums[k]>target) {
                return 1;
            }
            nums2[k]=nums[k];
        }
        for(int j=1;j<nums.length;j++) {
            for(int i=0;i<nums.length-j;i++) {
                if(nums2[i]>=target) return j;
                else {
                    nums2[i]+=nums[i+j];
                }
            }
        }
        return 0;

    }
}
