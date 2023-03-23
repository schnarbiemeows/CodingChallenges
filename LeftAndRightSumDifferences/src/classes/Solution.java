package classes;

/*
 * start time = warmup
 * end time =
 * total time =  minutes
 * speed = 100 %
 * memory = 69.78 %
 * notes:
 *
 */
public class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int leftTotal = 0;
        if(nums.length==1) {
            ans[0] = 0;
            return ans;
        }
        int rightTotal = 0;
        for(int index = 0; index<nums.length; index++) {
            rightTotal+=nums[index];
        }
        for(int index = 0; index<nums.length; index++) {
            rightTotal-=nums[index];
            ans[index] = Math.abs(rightTotal-leftTotal);
            leftTotal+=nums[index];
        }
        return ans;
    }
}
