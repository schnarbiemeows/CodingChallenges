package classes;

import java.util.HashMap;

public class Solution {
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
    	for(int i=0;i<nums.length;i++) {
    		Integer numValue = nums[i];
    		// if the map already has an entry keyed to this value
    		if(null!=numMap.get(numValue)) {
    			// then there will be an Integer representing the index of the previous occurrence of this value
    			Integer temp = numMap.get(numValue);
    			// if our current index(i) - temp <= k
    			Integer maxDiff = i-temp;
    			if(maxDiff<=k) {
    				// then we are done
    				return true;
    			} else {
    				// otherwise, the index entry that is there leads to a gap(j-i) that is > k,
    				// and since j is increasing, if we find another j, the new gap will be even greater
    				// so there is no need to retain this index entry anymore, and 
    				// we should replace temp with i
    				Integer itemtoReplace = i;
    				numMap.replace(numValue, itemtoReplace);
    			}
    		} else {
    			// else the map has no entry for this value
    			// so we need to create a HashMap entry for this index
    			// and put it into this map
    			Integer kobj = i;
    			numMap.put(numValue, kobj);
    		}
    	}
    	return false;
    }
}
