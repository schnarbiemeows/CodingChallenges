package classes;

import java.util.Arrays;

public class Solution {

	/* 
	 * first submission, no errors, but only beat 21.09% of submissions
	 */
	public int minDeletionSize(String[] A) {
		int itemLength = A[0].length();
        boolean[] inOrder = new boolean[itemLength];
        Arrays.fill(inOrder, Boolean.TRUE);
        for(int i=0;i<A.length-1;i++) {
        	for(int j=0;j<itemLength;j++) {
        		if(inOrder[j]==true) {
        			if(A[i+1].charAt(j)<A[i].charAt(j)) {
        				inOrder[j]=false;
        			}
        		}
        	}
        }
        int answer = 0;
        for(boolean item : inOrder) {
        	if(item==false) {
        		answer++;
        	}
        }
        return answer;
    }
}
