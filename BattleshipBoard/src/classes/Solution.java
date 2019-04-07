package classes;

/*
 * arg, 4 submissions
 * missed edge cases of {{'X'}}, {{}}, and then made the mistaken assumption that # ROWS = # COL
 * so, I missed the case [["X",".","X"]]
 * finally, 4th submission went
 * Runtime: 1 ms, faster than 99.38% of Java online submissions for Battleships in a Board.
 * Memory Usage: 43.5 MB, less than 5.00% of Java online submissions for Battleships in a Board.
 */
public class Solution {
	public int countBattleships(char[][] board) {
		int totalShips=0; 
        int ylength = board.length;
        int xlength = board[0].length;
        if(xlength==1&&ylength==1) {	// handles edge case of {{'X'}}
        	if(board[0][0]=='.') return 0;
        	else return 1;
        }
        if(xlength==1) {	// vertical case where number of columns = 1
        	boolean ship = false;
        	for(int v=0;v<ylength;v++) {
        		if(board[v][0]=='X') ship=true;
        		else {
        			if(ship) {
        				ship=false;
        				totalShips++;
        			}
        		}
        	}
        	if(ship) totalShips++;
        	return totalShips;
        }
        int[] verticalBattleships = new int[board[0].length];
        for(int y=0;y<ylength;y++) {
        	int shipLength=0;
        	if(y>0) {
	        	for(int x=0;x<xlength;x++) {
	        		if(verticalBattleships[x]>0&&board[y][x]=='.') {
	        			totalShips++;
	        			verticalBattleships[x]=0;
	        		}
	        	}
	        }
        	for(int i=0;i<xlength-1;i++) {
        		if(board[y][i]=='X'&&board[y][i+1]=='.') {
        			if(i==0||shipLength==1) {
        				verticalBattleships[i]+=1;
						shipLength=0;
        			}
        			else totalShips++;
        		}
        		else if(board[y][i]=='.'&&board[y][i+1]=='X') {
        			if(i==xlength-2)						
						verticalBattleships[i+1]+=1;
					else
						shipLength=1;
        		}
        		else if(board[y][i]=='X'&&board[y][i+1]=='X') {
					if(i==xlength-2)
						totalShips++;
					else shipLength++;
				}
        	}
        }
        for(int k=0;k<verticalBattleships.length;k++) { // also handles the case where # rows = 1
        	if(verticalBattleships[k]>0) totalShips++;
        }
        return totalShips;
    }
}
