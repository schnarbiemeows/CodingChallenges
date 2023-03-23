package classes;

/*
 * 3:38 - 3:45
 * speed = 86.22%
 * memory = 78.57%
 *
 */
public class Solution {
    public int dominantIndex(int[] nums) {
        int max = -2147483648;
        int maxIndex = -1;
        int max2 = -2147483648;
        for(int i = 0;i<nums.length;i++) {
            max = Math.max(max,nums[i]);
            if(max==nums[i]) {
                maxIndex=i;
            }
        }
        for(int i = 0;i<nums.length;i++) {
            if(nums[i]<max) {
                max2 = Math.max(max2,nums[i]);
            }
        }
        if(2*max2<=max) return maxIndex; else return -1;
    }

}
