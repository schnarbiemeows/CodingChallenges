package main;

import classes.Node;
import classes.Solution;

public class Main {

	/*
	 * 427
	 * difficulty - EASY
	 * We want to use quad trees to store an N x N boolean grid. Each cell in the grid can only 
	 * be true or false. The root node represents the whole grid. For each node, it will be 
	 * subdivided into four children nodes until the values in the region it represents are 
	 * all the same.
	 * Each node has another two boolean attributes : isLeaf and val. isLeaf is true if and 
	 * only if the node is a leaf node. The val attribute for a leaf node contains the value 
	 * of the region it represents.
	 * Your task is to use a quad tree to represent a given grid. The following example may 
	 * help you understand the problem better:
	 * Given the 8 x 8 grid below, we want to construct the corresponding quad tree: 
	 * 
	 */
	public static void main(String[] args) {
		int[][] input = {{1,1,0,0,0,0,0,0},
						 {1,1,0,0,0,0,0,0},
						 {1,1,0,0,0,0,1,1},
						 {1,1,0,0,0,0,1,1},
						 {0,0,0,0,0,0,1,1},
						 {0,0,0,0,0,0,1,1},
						 {1,1,1,1,1,1,0,0},
						 {1,1,1,1,1,1,0,0}};
		Solution sol = new Solution();
		Node answer = sol.construct(input);
		System.out.println("Done");
	}

}