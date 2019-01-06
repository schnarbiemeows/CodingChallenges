package classes;

/*
 * first submission, no errors, beat 32.50% of submissions
 * only missed a single "}" copying from the text
 * second submission(below) worse(?) only beat 18.36%
 */
public class Solution {

	public int projectionArea(int[][] grid) {
		int numitems = grid.length;
        int itemlength = grid[0].length;
        int[] maxOfEachDimension = new int[itemlength];
        int totalArea = 0;
        for(int i=0;i<numitems;i++) {
        	int maxOfEachItem = 0;
        	for(int j=0;j<itemlength;j++) {
        		if(grid[i][j]>0) totalArea++;
        		maxOfEachItem+= Math.max(grid[i][j]-maxOfEachItem,0);
        		maxOfEachDimension[j] = Math.max(maxOfEachDimension[j], grid[i][j]);
        	}
        	totalArea+=maxOfEachItem;
        }
        for(int l=0;l<itemlength;l++) {
        	totalArea+=maxOfEachDimension[l];
        }
        return totalArea;
    }
}
