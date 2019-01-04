package classes;

public class Solution {

	public boolean isUnivalTree(TreeNode root) {
	    if(root==null) return true;
		else
		return traverse(root,root.val); 
	    }
	    
	    public boolean traverse(TreeNode current, int val) {
		if(current==null) return true;
		if(current.val!=val) return false;
		return traverse(current.left,val)&&traverse(current.right,val);
	}
}
