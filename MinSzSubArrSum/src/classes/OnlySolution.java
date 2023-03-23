package classes;

/**
 * I couldn't do this one
 * this is a solution from the solutions discussion
 */
public class OnlySolution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        int l = 0;
        for(int r = 0; r < n; r++){
            sum += nums[r];
            while (sum >= target){
                res = Math.min(res, r-l+1);
                sum -= nums[l++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
