package classes;

/*
 * 3:23 - 3:34
 * speed = 82.15%
 * memory = 40.54%
 *
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1) {
            if(nums[0] == 0) {
                return 0;
            }
            return -1;
        }
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
        }
        int leftTotal = 0;
        int rightTotal = sum;
        for(int i=0;i<nums.length;i++) {
            if(i>0) {
                leftTotal+=nums[i-1];
            }
            rightTotal-=nums[i];
            if(leftTotal==rightTotal) {
                return i;
            }
        }
        return -1;
    }
}
