package classes;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution2 {

	/* 
	 * Max PriorityQueue - this only beats 51.56% of submissions
	 */
	public int findKthLargest(int[] nums, int k) {
		

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k,new Comparator<Integer>() {
		public int compare(Integer i1, Integer i2) {
			if(i1<i2) return 1;
			if(i1>i2) return -1;
			return 0;
		}
		});
		for(int i=0;i<nums.length;i++) {
		queue.add(nums[i]);
		}
		while(k>1) {
		queue.poll();
		k--;
		}
		return queue.poll();
	}
}
