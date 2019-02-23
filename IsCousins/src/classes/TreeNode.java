package classes;

public class TreeNode {

	int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) { val = x; }
	
	public void add(TreeNode newNode) {
		if(this.val==newNode.val) return;
		if(this.val>newNode.val) {
			if(this.left==null) this.left=newNode;
			else add(this.left,newNode);
		}
		if(this.val<newNode.val) {
			if(this.right==null) this.right=newNode;
			else add(this.right,newNode);
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
