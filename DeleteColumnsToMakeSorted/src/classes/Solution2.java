package classes;

public class Solution2 {

	/* 
	 * second submission, no errors, but only beat 36.60% of submissions
	 */
	public int minDeletionSize(String[] A) {
		int itemLength = A[0].length();
		int answer = 0;
        for(int i=0;i<itemLength;i++) {
        	for(int j=0;j<A.length-1;j++) {
        			if(A[j+1].charAt(i)<A[j].charAt(i)) {
        				answer++;
        				break;
        			}
        	}
        }
        return answer;
    }
}
