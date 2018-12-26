package main;

import classes.Solution;
import classes.Tree;
import classes.TreeNode;

public class SameTreeMain {

	/*
	 * difficulty - EASY
	 * Given two binary trees, write a function to check if they are the same or not.
	 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
	 */
	public static void main(String[] args) {

		Tree tree1 = new Tree(new TreeNode(4));
		tree1.add(new TreeNode(1));
		tree1.add(new TreeNode(2));
		tree1.add(new TreeNode(3));
		tree1.add(new TreeNode(7));
		tree1.add(new TreeNode(6));
		tree1.add(new TreeNode(9));
		Tree tree2 = new Tree(new TreeNode(4));
		tree2.add(new TreeNode(2));
		tree2.add(new TreeNode(1));
		tree2.add(new TreeNode(3));
		tree2.add(new TreeNode(7));
		tree2.add(new TreeNode(6));
		tree2.add(new TreeNode(9));
		/*myTree.add(new TreeNode(8));
		myTree.add(new TreeNode(5));*/
		tree1.inOrderTraversal();
		tree2.inOrderTraversal();
		Solution sol = new Solution();
		System.out.println(sol.isSameTree(tree1.getRoot(), tree2.getRoot()));
	}

}
