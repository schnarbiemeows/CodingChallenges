package classes;

import java.util.HashMap;

public class Solution {

	
	 public int repeatedNTimes(int[] A) {
		 HashMap<Integer,Integer> nums = new HashMap<Integer,Integer>();
		 for(int i=0;i<A.length;i++) {
			 if(nums.containsKey(A[i])) {
				 return A[i];
			 } else {
				 nums.put(A[i], A[i]);
			 }
		 }
		 return 0;
	 }
}
