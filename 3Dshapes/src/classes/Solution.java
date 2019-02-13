package classes;

/*
 * 892
 * first test, forgot that on the 0 edge cases t0 add lines 1 and 26(area+=grid[x][y];) to 
 * give full credit for the edge side
 * crap 2 wrong answers! finally, beat 71.71% speed,
 * 19.16% memory
 * 
 */
public class Solution {
	
	public int surfaceArea(int[][] grid) {
		int length = grid.length;
		int area = 0;
		for(int y=0;y<length;y++) {
			for(int x=0;x<length;x++){
				if(grid[x][y]>0) {
					area+=2;
					switch(x) {
						case(0) : area+=grid[x][y];
                                  if(x==length-1)  area+=grid[x][y];
								  else area+=Math.max(grid[x][y]-grid[x+1][y],0);				
								  break;
						default : area+=Math.max(grid[x][y]-grid[x-1][y],0);
								  if(x==length-1)  area+=grid[x][y];
								  else area+=Math.max(grid[x][y]-grid[x+1][y],0);
					}
					switch(y) {
						case(0) : area+=grid[x][y];
                                  if(y==length-1) area+=grid[x][y];
								  else area+=Math.max(grid[x][y]-grid[x][y+1],0);				
								  break;
						default : area+=Math.max(grid[x][y]-grid[x][y-1],0);
								  if(y==length-1) area+=grid[x][y];
								  else area+=Math.max(grid[x][y]-grid[x][y+1],0);
					}
				}
			}	
		}
		return area;
	}
}
