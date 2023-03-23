package classes;

/*
 * start time = 7:20
 * end time = 7:25
 * total time =  5 minutes
 * speed =  99.2%
 * memory =  57.55%
 * notes:
 * not sure why I only got that low on memory
 */
public class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        System.arraycopy(nums,0,ans,0,nums.length);
        System.arraycopy(nums,0,ans,nums.length,nums.length);
        return ans;
    }
}
