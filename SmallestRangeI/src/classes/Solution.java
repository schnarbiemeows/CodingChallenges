package classes;

import java.util.Arrays;

/*
 * first submission no errors, no syntax errors from text copy, only beat
 * 13.76% of submissions
 * rediculous, this second submission only beat 11.03%
 */
public class Solution {

	public int smallestRangeI(int[] A, int K) {
		Arrays.sort(A);
        return Math.max(A[A.length-1]-A[0]-2*K,0);
    }
}
