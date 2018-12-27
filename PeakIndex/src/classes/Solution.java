package classes;

public class Solution {

	/*
	 * 1st submission, no errors, took 7 minutes, beat 26.04% of submissions
	 * 2nd submission should be faster I thought, but it performed worse; only beat 1.77%
	 * of submissions. Is it because the second loop isnothing more than an if-then
	 * which I only do until I find the max
	 * whereas having the if-then inside the first loop guarantees that I always run that N times?
	 */
	public int peakIndexInMountainArray(int[] A) {
        int max = -1;
        int maxindex = -1;
        for(int i=0;i<A.length;i++) {
        	max = Math.max(max, A[i]);
        	if(max==A[i]) maxindex=i;
        }
        return maxindex;
    }
}
/*
 * first submission 
 
public int peakIndexInMountainArray(int[] A) {
int max = -1;
for(int i=0;i<A.length;i++) {
	max = Math.max(max, A[i]);
}
for(int i=0;i<A.length;i++) {
	if(A[i]==max) return i;
}
return 0;
}
*/