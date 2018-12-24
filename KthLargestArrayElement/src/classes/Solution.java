package classes;

import java.util.PriorityQueue;

public class Solution {

	public int findKthLargest(int[] nums, int k) {
		/* 
		 * Min PriorityQueue, this one only beat 51.56% of submissions
		 */
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
		for(int i=0;i<nums.length;i++) {
			if(queue.size()<k)
				queue.add(nums[i]);
			else if(nums[i]>queue.peek()) {
				queue.poll();
				queue.add(nums[i]);
			}
		}
		return queue.poll();	
    }
}


