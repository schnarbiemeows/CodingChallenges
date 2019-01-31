package classes;

/*
 * 566
 * brute force method, main mistake was, I was / and % by row #, not column # in
 * both for loops
 * first submission, 1 error, beat 77.27% of submissions
 */
public class Solution {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] answer = new int[r][c]; 
		int r1 = nums.length;
		int c1 = nums[0].length;
		int size = r*c;
		if(size!=r1*c1) return nums;
        int[] temp = new int[size];
        for(int i=0;i<size;i++) {
        	temp[i] = nums[i/c1][i%c1];
        }
        for(int i=0;i<size;i++) {
        	answer[i/c][i%c] = temp[i];
        }
        return answer;
    }
}
