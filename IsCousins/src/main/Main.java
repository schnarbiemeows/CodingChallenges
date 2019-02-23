package main;

import classes.Solution;
import classes.TreeNode;

public class Main {

	/*
	 * 993
	 * difficulty - EASY
	 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
	 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
	 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
	 * Return true if and only if the nodes corresponding to the values x and y are cousins.
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(5);
		Solution sol = new Solution();
		System.out.println(sol.isCousins(root, 5, 4));
	}

}
