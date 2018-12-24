package classes;

/*
 * this solution beat 68.52% of all submissions
 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {
		int i = 0,j = A.length-1;
		while(i<j) {
			while(i<A.length&&A[i]%2==0) i++;
			while(j>0&&A[j]%2!=0) j--;
			if(i<j)
				swap(A,i,j);
		}
		return A;
       
    }
	
	private void swap(int[] input, int start, int end) {
		int temp = input[end];
		input[end]=input[start];
		input[start]=temp;
	}
}