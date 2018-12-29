package classes;

import java.util.Arrays;

public class Solution {

	/*
	 * Have to sort this one, and then you want the pairs to be as close as possible to each other
	 * array size will always be even
	 * 1st submission, no errors, beat 29.12% of cases
	 */
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        int i = 0;
        while(i<nums.length) {
        	total+=nums[i];	// don't have to Math.min here with nums[i+1] because we know nums[i] will always be smaller
        	i+=2;
        }
        return total;
    }

}
