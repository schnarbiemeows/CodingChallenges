package classes;

import java.util.Arrays;

/*
 * rats, wrong answer on {1,3,2,4}
 * 
 */
public class Solution2 {

	public boolean isMonotonic(int[] A) {
		if(A.length==1) return true;
		int[] B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++) {
        	if(B[i]!=A[i]&&B[A.length-1-i]!=A[i]) return false;
        }
        return true;
    }
}
