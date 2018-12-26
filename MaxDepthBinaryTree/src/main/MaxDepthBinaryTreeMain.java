package main;

import classes.Solution;
import classes.Tree;
import classes.TreeNode;

public class MaxDepthBinaryTreeMain {

	/*
	 * difficulty - EASY
	 * Given a binary tree, find its maximum depth.
	 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
	 * Note: A leaf is a node with no children.
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
		System.out.println(sol.maxDepth(myTree.getRoot()));
	}

}
