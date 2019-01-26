package classes;

/*
 * 897
 * first submission had wrong answer, because this apparently is not a BST 
 * this answer beat 27.45%
 */
public class Solution {
	TreeNode newTree = null;
	public TreeNode increasingBST(TreeNode root) { 
        inorder(root); 
        return newTree;
    }
    
	public void inorder(TreeNode current) {
		if(current.left!=null) inorder(current.left) ;
		add(current);
		if(current.right!=null) inorder(current.right) ;
	}
    
	public void add(TreeNode newNode) {
		if(newTree==null) newTree = new TreeNode(newNode.val);
		else add(newTree,newNode);
	}
	
	private void add(TreeNode current, TreeNode newNode) {
		while(current.right!=null) current = current.right;
		current.right = new TreeNode(newNode.val);
	}
}
