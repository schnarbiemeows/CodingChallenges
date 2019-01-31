package classes;

import java.util.Arrays;

/*
 * 136
 * first submission, no errors, beat 41.22%
 * this is the O(1) space answer
 */
public class Solution {

	public int singleNumber(int[] nums) {
		if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        int index = 1;
        int size = nums.length;
        while(index<size&&nums[index]==nums[index-1]) {
        	index+=2;
        }
        if(index==size-1) return nums[index+1];
        return nums[index-1];
    }
}
