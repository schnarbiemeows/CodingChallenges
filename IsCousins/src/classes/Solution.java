package classes;

import java.util.LinkedList;
import java.util.Queue;

/*
 * the majority of my code was correct, the basic strategy, just had a number of small syntax problems
 * first submission wrong because I did not have "&&yparent!=0" on line 41(trying to save a step)
 * second submission beat 96.95% speed wise, but only 25.23% memory wise
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public boolean isCousins(TreeNode root, int x, int y) {
    	Queue<TreeNode> parents = new LinkedList<TreeNode>();
        Queue<TreeNode> children = new LinkedList<TreeNode>();
        parents.add(root);
        return findAnswer(x,y,parents,children);
    }
    
    public boolean findAnswer(int x, int y, Queue<TreeNode> parents,Queue<TreeNode> children) {
    	if(parents.isEmpty()) {
    		return false;
    	}
    	else {
    		int xparent=0,yparent = 0;
    		while(!parents.isEmpty()) {
    			TreeNode node = parents.remove();
    			if(node.left!=null&&node.left.val==x||node.right!=null&&node.right.val==x) xparent = node.val;
    			if(node.left!=null&&node.left.val==y||node.right!=null&&node.right.val==y) yparent = node.val;
    			if(node.left!=null) children.add(node.left);
    			if(node.right!=null) children.add(node.right);
    		}
    		if(xparent!=0&&yparent!=0&&xparent!=yparent) return true;
            else {
                parents = children;
    		    children = new LinkedList<TreeNode>();
    		    return findAnswer(x,y,parents,children);
            }	
    	}
    }
}