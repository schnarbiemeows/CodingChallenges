package classes;

import java.util.Stack;

/*
 * first submission, no errors, beat 31.31%
 */
public class Solution {

	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> root1q = new Stack<TreeNode>();
        Stack<TreeNode> root2q = new Stack<TreeNode>();
        addLeaves(root1,root1q);
        addLeaves(root2,root2q);
        if(root1q.size()!=root2q.size()) return false;
        while(!root1q.isEmpty()) {
        	if(((TreeNode)root1q.pop()).val!=((TreeNode)root2q.pop()).val) return false;
        }
        return true;
    }
    
    private void addLeaves(TreeNode current, Stack<TreeNode> que) {
    	if(current.left==null&&current.right==null) {
    		que.push(current);
    	} else {
    		if(current.left!=null) addLeaves(current.left,que);
    		if(current.right!=null) addLeaves(current.right,que);
    	}
    }
}
