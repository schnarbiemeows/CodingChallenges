package classes;

/*
 * start time = 2:04
 * end time = 2:18
 * total time = 14 minutes
 * speed = 77.51 %
 * memory = 32.48 %
 * notes:
 *  so, do items 1, 1+n, 2, 2+n, 3, 3+n, etc..
 * always the same # of items tho
 * easiest to make another array
 * how would we do in-place tho?
 *  low memory score cause I decided not to do inplace
 */
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        for(int i=0;i<nums.length/2;i++) {
            ans[index] = nums[i];
            ans[index+1] = nums[i+n];
            index+=2;
        }
        return ans;
    }
}
