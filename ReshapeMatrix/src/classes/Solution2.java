package classes;

/*
 * 566
 * there we go! i realized I could consolidate the 2 loops!
 * this one beat 100%!!!
 */
public class Solution2 {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] answer = new int[r][c]; 
		int r1 = nums.length;
		int c1 = nums[0].length;
		int size = r*c;
		if(size!=r1*c1) return nums;
        for(int i=0;i<size;i++) {
        	answer[i/c][i%c] = nums[i/c1][i%c1];
        }
        return answer;
    }
}
