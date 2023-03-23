package classes;

/*
 * start time =
 * end time =
 * total time =  minutes
 * speed =  %
 * memory =  %
 * notes:
 *
 */
public class Solution1 {
    public int findMaxK(int[] nums) {
        if(nums.length==1) return -1;
        int[] cs = new int[2001];
        for(int i=0;i<nums.length;i++) {
            cs[nums[i]+1000]++;
        }
        for(int i=2000;i>0;i--) {
            if(cs[i]>0&&cs[2000-i]>0) {
                return i-1000;
            }
        }
        return -1;
    }
}
