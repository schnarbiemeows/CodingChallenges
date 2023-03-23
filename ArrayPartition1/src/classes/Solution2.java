package classes;

import java.util.Arrays;

/**
 * 6:38 - 6:45 = 7 minutes
 * speed = 14.79%
 * memory = 47.17%
 * this one was a bullshit one, because I read the hints, which told me how to do it, but
 * I don't exactly understand why.
 * meanwhile, the slow speed is primarily due to the Arrays.sort, so
 * a counting sort would improve the performance
 */
public class Solution2 {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for(int i=0;i<nums.length;i+=2) {
            total += nums[i];
        }
        return total;
    }
}
