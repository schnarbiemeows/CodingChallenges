package classes;

public class Solution {

	/*
	 * recursive solution
	 * HA! first submission, beat 100% of all submissions!
	 */
	public int maxDepth(TreeNode root) {
		if(root==null) return 0;
		else return Math.max((1+maxDepth(root.left)),(1+maxDepth(root.right)));
    }
}
