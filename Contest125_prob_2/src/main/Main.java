package main;

import classes.Solution;

public class Main {

	/*
	 * 999
	 * difficulty - EASY
	 * On an 8 x 8 chessboard, there is one white rook.  There also may be empty squares, white bishops, 
	 * and black pawns.  These are given as characters 'R', '.', 'B', and 'p' respectively. Uppercase 
	 * characters represent white pieces, and lowercase characters represent black pieces.
	 * The rook moves as in the rules of Chess: it chooses one of four cardinal directions 
	 * (north, east, west, and south), then moves in that direction until it chooses to stop, reaches 
	 * the edge of the board, or captures an opposite colored pawn by moving to the same square it occupies.  
	 * Also, rooks cannot move into the same square as other friendly bishops.
	 * Return the number of pawns the rook can capture in one move.
	 */
	public static void main(String[] args) {
		char[][] board = {{'.','.','.','.','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'p','p','.','R','.','p','B','.'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','B','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'}};

		Solution sol = new Solution();
		System.out.println(sol.numRookCaptures(board));
	}

}
