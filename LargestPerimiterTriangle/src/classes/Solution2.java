package classes;

import java.util.Arrays;

/*
 * 976
 * pfft, only beat 37.05%
 */
public class Solution2 {

	public int largestPerimeter(int[] A) {
		int k = A.length-1;
		Arrays.parallelSort(A);
		while(k>1&&A[k]>=A[k-1]+A[k-2]) k--;
		if(k==1) return 0; else return A[k]+A[k-1]+A[k-2];
    }
}
