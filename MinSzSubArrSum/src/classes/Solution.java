package classes;

/*
 * 10:25 - 10:55 damn, time limit exceeded for super large input
 * take a break at 11
 *
 * speed =
 * memory =
 * 2,3,1,2,4,3
 */
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = nums.length+1;
        for(int i=0;i<nums.length;i++) {
            int total = 0;
            for(int j=i;j<nums.length;j++) {
                total+=nums[j];
                if(total>=target) {
                    minlen=Math.min(minlen,j-i+1);
                    break;
                }
            }
        }
        if(minlen==nums.length+1) {
            return 0;
        }
        return minlen;
    }
}
