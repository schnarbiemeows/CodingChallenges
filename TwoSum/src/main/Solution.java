package main;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	/*
	 * submitted, beat 43.9% of all submissions
	 */
	public int[] twoSum(int[] nums, int target) {
		int[][] newsum = new int[nums.length][2];
		for(int i=0;i<nums.length;i++) {
			newsum[i][0]=nums[i];
			newsum[i][1]=i;
		}
		Arrays.sort(newsum, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]>o2[0]) return 1;
				if(o1[0]<o2[0]) return -1;
				return 0;
			}
		});
		int i = 0;
		int j = newsum.length-1;
		int answer[] = new int[2];
		while(i<j) {
			if(newsum[i][0]+newsum[j][0]==target) {
				answer[0]=newsum[i][1];
				answer[1]=newsum[j][1];
				return answer;
			} else if(newsum[i][0]+newsum[j][0]<target) i++;
			else j--;
		}
		return answer;
	}
}
