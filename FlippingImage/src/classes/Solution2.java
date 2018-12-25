package classes;

public class Solution2 {
	/*
	 * accepted first time, no errors, beat 52.10% of submissions
	 */
	public int[][] flipAndInvertImage(int[][] A) {
		for(int i=0;i<A.length;i++) {
        	swap(A[i]);
        }
        int itemlength = A[0].length;
        if(itemlength%2!=0) {
        	for(int i=0;i<A.length;i++) {
            	A[i][itemlength/2] = A[i][itemlength/2]==0 ? 1 : 0;
            }
        }
        return A;
    }
	
	private void swap(int[] input) {
		int i=0;
		int j=input.length-1;
		while(i<j) {
			if(input[i]==input[j]) {
				input[i] = input[i]==0 ? 1 : 0;
				input[j] = input[j]==0 ? 1 : 0;
			}
			i++;
			j--;
		}
	}
}
