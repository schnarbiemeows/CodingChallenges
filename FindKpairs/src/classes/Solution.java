package classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

	/*
	 * this solution beat 67.70% of submissions
	 */
	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<int[]> answer = new LinkedList<int[]>();
		if(nums1.length==0||nums2.length==0) return answer;
		if(k==1) {
			int[] arrays = {nums1[0],nums2[0]};
			return Arrays.asList(arrays);
		}
		PriorityQueue<int[]> queue = new PriorityQueue<int[]>(k,new Comparator<int[]>() {
			public int compare(int[] i1, int[] i2) {
				if(i1[0]+i1[1]<i2[0]+i2[1]) return 1;
				if(i1[0]+i1[1]>i2[0]+i2[1]) return -1;
				return 0;
			}
			});
		for(int i=0;i<nums1.length;i++) {
			for(int j=0;j<nums2.length;j++) {
				if(queue.size()<k) {
					int[] item = new int[2];
					item[0]=nums1[i];
					item[1]=nums2[j];
					queue.add(item);
				} else {
					if(nums1[i]+nums2[j]<queue.peek()[0] + queue.peek()[1]) {
						queue.poll();
						int[] item = new int[2];
						item[0]=nums1[i];
						item[1]=nums2[j];
						queue.add(item);
					}
				}
			}
		}
        while(queue.size()!=0) {
        	answer.add(0,queue.poll());
        }
        return answer;
    }
	
	
}
