package classes;

public class Tree {

	private TreeNode root;
	public TreeNode getRoot() {
		return root;
	}

	public Tree(TreeNode root) {
		this.root=root;
	}
	
	public void add(TreeNode item) {
		if(root==null) root=item;
		else add(root,item);
	}
	
	public void add(TreeNode currentItem, TreeNode newItem) {
		if(newItem.val==currentItem.val) return;
		else if(newItem.val>currentItem.val) {
			if(currentItem.right==null) currentItem.right=newItem;
			else add(currentItem.right,newItem) ;
		} else {
			if(currentItem.left==null) currentItem.left=newItem;
			else add(currentItem.left,newItem);
		}
	}
	
	public int determineMaxHeight() {
		return determineMaxHeight(root);
	}
	
	private int determineMaxHeight(TreeNode currentNode) {
		if(currentNode==null) return 0;
		else return Math.max((1+determineMaxHeight(currentNode.left)),(1+determineMaxHeight(currentNode.right)));
	}
	
	public void inOrderTraversal() {
		System.out.print("[");
		inOrderTraversal(root);
		System.out.println("]");
	}
	
	private void inOrderTraversal(TreeNode currentNode) {
		if(currentNode==null) return;
		System.out.print(currentNode.val+",");
		inOrderTraversal(currentNode.left);
		inOrderTraversal(currentNode.right);
	}
}
