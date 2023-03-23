package classes;

import java.util.Arrays;

/*
 * 888
 * works, but crappy solution, only beat 28.34% speed
 * and 1.78% memory
 */
public class Solution {
	public int[] fairCandySwap(int[] A, int[] B) {
     	Arrays.sort(A);
     	Arrays.sort(B);
     	int atotal = 0;
     	int btotal = 0;
     	for(int i =0;i<A.length;i++) {
     		atotal+=A[i];
     	}  
     	for(int j =0;j<B.length;j++) {
     		btotal+=B[j];
     	}
     	int diff = Math.abs(atotal-btotal)/2;
     	if(btotal>atotal) {
     		for(int k=0;k<A.length;k++) {
     			int start = 0;
     			while(B[start]-A[k]<diff&&start<B.length-1) start++;
     			if(B[start]-A[k]==diff) return new int[] {A[k],B[start]};
     		}
     	} else {
     		for(int k=0;k<B.length;k++) {
     			int start = 0;
     			while(A[start]-B[k]<diff&&start<A.length-1) start++;
     			if(A[start]-B[k]==diff) return new int[] {A[start],B[k]};
     		}
     	}
     	return null;
    }
}
