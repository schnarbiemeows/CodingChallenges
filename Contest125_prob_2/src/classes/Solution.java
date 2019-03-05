package classes;

/*
 * 
 */
public class Solution {

	public int numRookCaptures(char[][] board) {
        int count = 0;
        int x = 0,y=0;
        outerloop : while(y<8) {
	        	while(x<8) {
	        		if(board[y][x]=='R') {
	        			break outerloop;
	        		}
	        		x++;
	        	}
	        	x=0;
	        	y++;
        }
        int e=x-1,w=x+1,n=y-1,s=y+1;
        eloop : while(e>=0) {
        			if(board[y][e]=='p') {
        				count++;
        				break eloop;
        			}
        			if(board[y][e]=='B') break eloop;
        			e--;
        		}
         wloop : while(w<8) {
        			if(board[y][w]=='p') {
        				count++;
        				break wloop;
        			}
        			if(board[y][w]=='B') break wloop;
        			w++;
        		}
        nloop : while(n>=0) {
        			if(board[n][x]=='p') {
        				count++;
        				break nloop;
        			}
        			if(board[n][x]=='B') break nloop;
        			n--;
        		}
        sloop : while(s<8) {
        			if(board[s][x]=='p') {
        				count++;
        				break sloop;
        			}
        			if(board[s][x]=='B') break sloop;
        			s++;
        		}
        return count;
    }
}
