package main;

import classes.Solution;
import classes.TreeNode;

public class Main {

	/*
	 * 897
	 * difficulty - EASY
	 * Given a tree, rearrange the tree in in-order so that the leftmost node in the tree is now 
	 * the root of the tree, and every node has no left child and only 1 right child.
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(379);
		//root.add(new TreeNode(379));
		root.add(new TreeNode(826));
		/*root.add(new TreeNode(2));
		root.add(new TreeNode(1));
		root.add(new TreeNode(4));
		root.add(new TreeNode(8));
		root.add(new TreeNode(7));
		root.add(new TreeNode(9));*/
		root.inorder(root);
		System.out.println();
		Solution sol = new Solution();
		TreeNode newRoot = sol.increasingBST(root);
		newRoot.inorder(newRoot);
	}

}
