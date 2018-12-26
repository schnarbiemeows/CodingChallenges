package main;

import classes.Solution;
import classes.Tree;
import classes.TreeNode;

public class InvertBinaryTreeMain {

	/*
	 * difficulty - EASY
	 * Invert a binary tree.
	 * So we are given a definition for the TreeNode class, but not the Tree itself,
	 * the assumption here is that we don't need this, we'll just be handed the root
	 * 
	 * write a recursive method and a non-recursive method
	 */
	public static void main(String[] args) {

		Tree myTree = new Tree(new TreeNode(4));
		myTree.add(new TreeNode(2));
		myTree.add(new TreeNode(1));
		myTree.add(new TreeNode(3));
		myTree.add(new TreeNode(7));
		myTree.add(new TreeNode(6));
		myTree.add(new TreeNode(9));
		/*myTree.add(new TreeNode(8));
		myTree.add(new TreeNode(5));*/
		myTree.inOrderTraversal();
		Solution sol = new Solution();
		sol.switchChildren(null);
		myTree.inOrderTraversal();
		System.out.println(myTree.determineMaxHeight());
	}

}
