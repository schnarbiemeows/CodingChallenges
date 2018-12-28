package classes;

import java.util.Stack;

public class Solution {

	/*
	 * first submission no errors, it didn't say how my code ranked
	 */
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1.length==0) return nums1;
        int[] answers = new int[nums1.length];
        Stack<Integer> temp = new Stack<Integer>();
        for(int i=0;i<nums1.length;i++) {
        	while(!temp.isEmpty()) temp.pop();
        	for(int j=nums2.length-1;j>=0;j--) {
        		temp.push(nums2[j]);
        	}
        	while(temp.peek()!=nums1[i]) temp.pop();
        	int answer = -1;
        	temp.pop();
        	while(!temp.isEmpty()) {
        		if(temp.peek()>nums1[i]) {
        			answer = temp.pop();
        			break;
        		} else {
        			temp.pop();
        		}
        	}
        	answers[i]=answer;
        }
        return answers;
    }
}
