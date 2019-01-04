package classes;

public class Solution {

	/*
	 * solution passes on first submit with no errors,
	 * but only beats 12.64% of submissions. I think that the % is 
	 * much more affected randomly by how fast your submissions runs, 
	 * which can very greatly. This answer is essentially identical to 
	 * an answer in the discussion that beat 100%
	 * 
	 */
	public TreeNode searchBST(TreeNode root, int val) {
		if(root==null) return null;
		if(root.val==val) return root;
		if(root.val<val) return searchBST(root.right, val);
		else return searchBST(root.left,val);
    }
}
