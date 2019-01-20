package main;

import classes.Solution;
import classes.TreeNode;

public class Main {

	/*
	 * 669
	 * difficulty - EASY
	 * Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that 
	 * all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the 
	 * result should return the new root of the trimmed binary search tree.
	 * 
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(28);
		root.add(new TreeNode(12));
		root.add(new TreeNode(45));
		root.add(new TreeNode(4));
		root.add(new TreeNode(24));
		
		root.add(new TreeNode(35));
		root.add(new TreeNode(47));
		root.add(new TreeNode(2));
		root.add(new TreeNode(9));
		
		root.add(new TreeNode(14));
		root.add(new TreeNode(25));
		root.add(new TreeNode(31));
		root.add(new TreeNode(42));
		
		root.add(new TreeNode(46));
		root.add(new TreeNode(48));
		root.add(new TreeNode(0));
		root.add(new TreeNode(3));
		
		root.add(new TreeNode(8));
		root.add(new TreeNode(11));
		root.add(new TreeNode(13));
		root.add(new TreeNode(20));
		
		root.add(new TreeNode(26));
		root.add(new TreeNode(30));
		root.add(new TreeNode(33));
		root.add(new TreeNode(41));
		
		root.add(new TreeNode(43));
		root.add(new TreeNode(49));
		root.add(new TreeNode(1));
		root.add(new TreeNode(7));
		
		root.add(new TreeNode(10));
		root.add(new TreeNode(17));
		root.add(new TreeNode(22));
		root.add(new TreeNode(27));
		
		root.add(new TreeNode(29));
		root.add(new TreeNode(32));
		root.add(new TreeNode(34));
		root.add(new TreeNode(36));
		
		root.add(new TreeNode(44));
		root.add(new TreeNode(6));
		root.add(new TreeNode(16));
		root.add(new TreeNode(18));
		
		root.add(new TreeNode(21));
		root.add(new TreeNode(23));
		root.add(new TreeNode(37));
		root.add(new TreeNode(5));
		
		root.add(new TreeNode(15));
		root.add(new TreeNode(19));
		root.add(new TreeNode(40));
		root.add(new TreeNode(39));
		
		root.add(new TreeNode(38));
		
		Solution sol = new Solution();
		TreeNode answer = sol.trimBST(root, 12, 22);
		answer.preorder(answer);
	}

}
