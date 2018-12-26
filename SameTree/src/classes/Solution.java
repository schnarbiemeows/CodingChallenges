package classes;

public class Solution {

	/* 
	 * first submission no errors, beat 22.98% of submissions
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
		return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
	
	
}
