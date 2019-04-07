package classes;

/*
 * WOOT!
 * first submission, perfect score!
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Partition Array Into Three Parts With Equal Sum.
 * Memory Usage: 51.6 MB, less than 100.00% of Java online submissions for Partition Array Into Three Parts With Equal Sum.
 */
public class Solution {
	public boolean canThreePartsEqualSum(int[] A) {
		int sum = 0, total = 0; 
        for(int i=0;i<A.length;i++) {
        	sum+=A[i];
        }
        if(sum%3!=0) return false;
        sum = sum/3;
        int counter = 0;
        while(total!=sum&&counter<A.length) {
        	total+=A[counter];
        	counter++;
        }
        if(counter==A.length) return false;
        total=0;
        while(total!=sum&&counter<A.length) {
        	total+=A[counter];
        	counter++;
        }
        if(counter==A.length) return false;
        return true;
    }
}
