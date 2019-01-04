package main;

import classes.Solution;
import classes.Tree;
import classes.TreeNode;

public class SearchBSTMain {

	/*
	 * difficulty - EASY
	 * Given the root node of a binary search tree (BST) and a value. 
	 * You need to find the node in the BST that the node's value equals 
	 * the given value. Return the subtree rooted with that node. If such 
	 * node doesn't exist, you should return NULL.
	 */
	public static void main(String[] args) {
		Tree tree1 = new Tree(new TreeNode(4));
		tree1.add(new TreeNode(2));
		tree1.add(new TreeNode(7));
		tree1.add(new TreeNode(3));
		tree1.add(new TreeNode(1));
		Solution sol = new Solution();
		System.out.println(tree1.determineMaxHeight());
		TreeNode answer = sol.searchBST(tree1.getRoot(), 2);
		if(answer==null) System.out.println("nothing found");
		else System.out.println(answer.toString());
	}

}
