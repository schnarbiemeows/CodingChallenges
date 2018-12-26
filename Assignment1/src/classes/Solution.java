package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	/*
	 * first submission timed out, so I had to use a set instead of using line 27
	 * and then it accepted it, but it only beat 9.11% of java submissions
	 */
	public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answers = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
        	int remainder = 0 - nums[i];
        	int j = i+1;
        	int k = nums.length-1;
        	while(j<k) {
        		if(nums[j]+nums[k]==remainder) {
        			List<Integer> item = new ArrayList<Integer>();
        			item.add(nums[i]);
        			item.add(nums[j]);
        			item.add(nums[k]);
        			//if(!answers.contains(item))
        			answers.add(item);
        			j++;
        			k--;
        		}
        		else if(nums[j]+nums[k]<remainder) j++;
        		else k--;
        	}
        }
        return new ArrayList<>(answers);
    }
}
