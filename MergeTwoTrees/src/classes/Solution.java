package classes;

public class Solution {

	/*
	 * 1st submission, no errors, beat 13.95% of submissions
	 */
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null) return t2;
        if(t2==null) return t1;
        TreeNode newRoot = makeNewTree(t1,t2);
        return newRoot;
    }
	
	public TreeNode makeNewTree(TreeNode t1, TreeNode t2) {
		if(t1==null&&t2==null) return null;
		TreeNode newNode = null;
		if(t1==null) {
			newNode = new TreeNode(t2.val);
			newNode.left = makeNewTree(null,t2.left);
	        newNode.right = makeNewTree(null,t2.right);
		}
		else if(t2==null) {
			newNode = new TreeNode(t1.val);
	        newNode.left = makeNewTree(t1.left,null);
	        newNode.right = makeNewTree(t1.right,null);
		}
		else { 
			newNode = new TreeNode(t1.val+t2.val);
			newNode.left = makeNewTree(t1.left,t2.left);
	        newNode.right = makeNewTree(t1.right,t2.right);
		}
        return newNode;
	}
}
