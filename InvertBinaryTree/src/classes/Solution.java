package classes;

public class Solution {

	/*
	 * recursive solution
	 * HA! first submission, beat 100% of all submissions!
	 */
	public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        switchChildren(root);
        return root;
    }
	public void switchChildren(TreeNode root) {
		if(root!=null) {
			if(root.left!=null||root.right!=null) {
				TreeNode temp = root.left;
				root.left=root.right;
				root.right=temp;
			}
			switchChildren(root.left);
			switchChildren(root.right);
		}
	}
}
