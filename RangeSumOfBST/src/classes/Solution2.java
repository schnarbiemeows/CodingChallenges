package classes;

/*
 * this one I came up with very soon after solution 1 with much better results
 * speed = 100 %
 * memory = 37 %
 * notes:
 * recursive solution
 * if it is a BST, then the items should be in order
 * if the node is not null AND is within the range then
 * - return the node's value + total(leftNode) + total(rightNode)
 * else return 0
 */
public class Solution2 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        return total(root,low,high);
    }
    public int total(TreeNode root, int low, int high) {
        if(root==null) return 0;
        int subtotal = 0;
        if(low<=root.val && root.val<=high) {
            subtotal += root.val;
        }
        if(low<=root.val && root.left!=null) {
            subtotal += total(root.left,low,high);
        }
        if(root.val<=high && root.right!=null) {
            subtotal += total(root.right,low,high);
        }
        return subtotal;
    }
}
