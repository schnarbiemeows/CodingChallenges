package classes;

/*
 * had a few problems:
 * can't use "if(i!=j)" because I am copying data from 1 matrix to another
 * forgot that I can't do an in-place solution, because the matrix dimensions can change
 * no submission comparisons available
 */
public class Solution {
	public int[][] transpose(int[][] A) {
		int[][] answer = new int[A[0].length][A.length];
		for(int i=0;i<A.length;i++) {
	    	for(int j=0;j<A[0].length;j++) {
	    		answer[j][i] = A[i][j];
	    	}
	    }
	    return answer;
	}
}
