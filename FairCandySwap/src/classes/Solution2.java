package classes;

import java.util.HashSet;
import java.util.Set;

/*
 * 888
 * this one is better, beat 83.77% speed
 * and 29.27% memory
 */
public class Solution2 {
	public int[] fairCandySwap(int[] A, int[] B) {
     	Set<Integer> anums = new HashSet<Integer>();
     	int acount=0,bcount=0;
     	for(int i=0;i<A.length;i++) {
     		anums.add(A[i]);
     		acount+=A[i];
     	}
     	for(int i=0;i<B.length;i++) {
     		bcount+=B[i];
     	}
     	int diff = Math.abs(acount-bcount)/2;
     	for(int i=0;i<B.length;i++) {
     		int count = 0;
     		if(acount>bcount) count = B[i]+diff;
     		else count = B[i]-diff;
     		if(anums.contains(count)) return new int[] {count,B[i]};
     	}
     	return null;
    }
}
