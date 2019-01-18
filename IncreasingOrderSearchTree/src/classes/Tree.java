package classes;

public class Tree {

	private TreeNode root;

	public Tree(TreeNode node) {
		this.root = node;
	}
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public void add(TreeNode node) {
		if(root==null) root = node;
		else {
			add(root,node);
		}
	}
	
	private void add(TreeNode current, TreeNode newNode) {
		if(current.val==newNode.val) return;
		if(current.val>newNode.val) {
			if(current.left==null) current.left=newNode;
			else add(current.left,newNode);
		}
		if(current.val<newNode.val) {
			if(current.right==null) current.right=newNode;
			else add(current.right,newNode);
		}
	}
}
