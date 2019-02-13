package classes;

import java.util.Arrays;

/*
 * ok, this answer beat 74.23% speed
 * 50.92% memory
 */
public class Solution {

	public boolean isMonotonic(int[] A) {
		if(A.length==1) return true;
		int i=1;
		boolean increasing=true,decreasing=true;
		while(i<A.length) {
			if(A[i-1]>A[i]) increasing=false;
			if(A[i-1]<A[i]) decreasing = false;
			i++;
		}
		return increasing||decreasing;
    }
}
