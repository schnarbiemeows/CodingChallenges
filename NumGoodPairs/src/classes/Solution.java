package classes;

/*
 * start time = 5:07
 * end time = 5:12
 * total time = 5 minutes
 * speed = 50.40 %
 * memory = 78 %
 * notes:
 * slow O(^n)
 */
public class Solution {
    public int numIdenticalPairs(int[] nums) {
        if(nums.length==1) return 0;
        int count = 0;
        for(int i = 0; i<nums.length-1;i++) {
            for(int j = nums.length-1;j>i;j--) {
                if(nums[i]==nums[j]) count++;
            }
        }
        return count;
    }
}
