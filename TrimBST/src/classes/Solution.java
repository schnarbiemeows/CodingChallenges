package classes;

/*
 * 669
 * very disappointed, tried to do the iterative solution, multiple fails, had to cheat, and
 * by the time I switched to recursive solution, I had already glanced at an answer
 * this is my version of the answer - beat 98.89%
 */
public class Solution {
	public TreeNode trimBST(TreeNode root, int L, int R) {
		if(root==null) return root;
		if(root.val<L) return trimBST(root.right,L,R);
		if(root.val>R) return trimBST(root.left,L,R);
		root.left = trimBST(root.left,L,R);
		root.right = trimBST(root.right,L,R);
		return root;
	}
}
