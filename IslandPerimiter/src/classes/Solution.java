package classes;

/*
 * 463 - first submission, had some small defects:
 * lines 20 and 32 need to compare x,y to 1, not 0
 * lines 25 and 29 need to be <= instead of <
 * 
 * beat 78.24% of submissions
 */
public class Solution {

	public int islandPerimeter(int[][] grid) {
        int length = grid.length;
        int width = grid[0].length;
        int perimiter = 0;
        for(int y = 0;y<length;y++) {
        	for(int x=0;x<width;x++) {
        		if(grid[y][x]==1) {
        			int subtotal = 4;
	        		// north
	        		if(y>0) {
	        			if(grid[y-1][x]==1) subtotal--;
	        		}
	        		// east
	        		if(x<=width-2) {
	        			if(grid[y][x+1]==1) subtotal--;
	        		}
	        		// south
	        		if(y<=length-2) {
	        			if(grid[y+1][x]==1) subtotal--;
	        		}
	        		// west
	        		if(x>0) {
	        			if(grid[y][x-1]==1) subtotal--;
	        		}
	        		perimiter+=subtotal;
	        	}
        	}
        }
        return perimiter;
    }
}
