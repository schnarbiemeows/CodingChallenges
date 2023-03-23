package main;

import classes.Solution;
import classes.TreeNode;

public class Main {

	/*
		2236
	 * difficulty - 
	 * description:
	 * You are given the root of a binary tree that consists of exactly 3 nodes:
	 	the root, its left child, and its right child.
	 	Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.
	 * constraints:
	 *	The tree consists only of the root, its left child, and its right child.
		-100 <= Node.val <= 100
	 */
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		TreeNode root = new TreeNode(10, new TreeNode(4),new TreeNode(6));
		System.out.println(sol.checkTree(root));
		root = new TreeNode(5, new TreeNode(3),new TreeNode(1));
		System.out.println(sol.checkTree(root));
	}

}
