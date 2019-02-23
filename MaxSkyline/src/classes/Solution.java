package classes;

/*
 * 807
 * sweet! almost a perfect first submission, beat 100% on speed!
 * can't get results for memory, but best was 35M, mine was 42M
 */
public class Solution {

	public int maxIncreaseKeepingSkyline(int[][] grid) {
        int length = grid.length;
        if(length==1) return 0;
        int[][] newgrid = new int[length][length];
        int[] northsouthmax = new int[length];
        int[] eastwestmax = new int[length];
        for(int y=0;y<length;y++) {
        	for(int x=0;x<length;x++) {
        		if(northsouthmax[x] < grid[y][x]) northsouthmax[x] = grid[y][x];
				if(eastwestmax[y] < grid[y][x]) eastwestmax[y] = grid[y][x];
        	}
        } 
        int total = 0;
        for(int y2=length-1;y2>=0;y2--) {
        	for(int x2=0;x2<length;x2++) {
        		int maxheight = Math.min(northsouthmax[x2],eastwestmax[y2]);
        		if(maxheight>grid[y2][x2]) {
					total+=maxheight-grid[y2][x2];
					newgrid[y2][x2]=maxheight;
				} else {
					newgrid[y2][x2]=grid[y2][x2];
				}
        	}
        }
        return total;
    }
}
