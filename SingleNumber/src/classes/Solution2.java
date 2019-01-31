package classes;

import java.util.HashSet;

/*
 * 136
 * first submission, no errors, worse, only beat 23.02%
 */
public class Solution2 {

	public int singleNumber(int[] nums) {
		if(nums.length==1) return nums[0];
        HashSet<Integer> store = new HashSet<Integer>();
        int total = 0;
        for(int i=0;i<nums.length;i++) {
        	if(store.contains(nums[i])) total-=nums[i];
        	else {
        		total+=nums[i];
        		store.add(nums[i]);
        	}
        }
        return total;
    }
}
