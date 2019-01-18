package classes;

/*
 * 766
 * made a mistake, had the matrix dimensions backwards
 * beat 29.21%
 */
public class Solution {
	public boolean isToeplitzMatrix(int[][] matrix) {
        int width = matrix[0].length;
        int height = matrix.length;
        for(int x=0;x<width;x++) {
        	int xoffset=1,yoffset=1;
        	while(x+xoffset<width&&yoffset<height) {
        		if(matrix[0][x]!=matrix[yoffset][x+xoffset]) 
        			return false;
        		xoffset++;
        		yoffset++;
        	}
        }
        for(int y=1;y<height;y++) {
        	int xoffset=1,yoffset=1;
        	while(xoffset<width&&y+yoffset<height) {
        		if(matrix[y][0]!=matrix[y+yoffset][xoffset]) 
        			return false;
        		xoffset++;
        		yoffset++;
        	}
        }
        return true;
    }
}
