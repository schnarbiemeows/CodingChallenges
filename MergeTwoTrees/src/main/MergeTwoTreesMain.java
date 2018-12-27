package main;

import classes.Solution;
import classes.Tree;
import classes.TreeNode;

public class MergeTwoTreesMain {

	/*
	 * difficulty - EASY
	 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two 
	 * trees are overlapped while the others are not.
	 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node 
	 * values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
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
		tree2.add(new TreeNode(1));
		tree2.add(new TreeNode(2));
		tree2.add(new TreeNode(3));
		tree2.add(new TreeNode(7));
		tree2.add(new TreeNode(6));
		tree2.add(new TreeNode(9));
		/*myTree.add(new TreeNode(8));
		myTree.add(new TreeNode(5));*/
		tree1.inOrderTraversal();
		tree2.inOrderTraversal();
		Solution sol = new Solution();
		Tree tree3 = new Tree(sol.mergeTrees(tree1.getRoot(), tree2.getRoot()));
		tree3.inOrderTraversal();
	}
}
