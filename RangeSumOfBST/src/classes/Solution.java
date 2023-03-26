package classes;

/*
 * start time = 2:28
 * end time = 2:44
 * total time =  16 minutes
 * speed = 58.78 %
 * memory = 20.18 %
 * notes:
 * recursive solution
 * if it is a BST, then the items should be in order
 * if the node is not null AND is within the range then
 * - return the node's value + total(leftNode) + total(rightNode)
 * else return 0
 */
public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return total(root,low,high);
    }

    public int total(TreeNode root, int low, int high) {
        if(root==null) return 0;
        int subtotal = 0;
        if(low<=root.val && root.val<=high) {
            subtotal += root.val;
        }
        if(root.left!=null) {
            subtotal += total(root.left,low,high);
        }
        if(root.right!=null) {
            subtotal += total(root.right,low,high);
        }
        return subtotal;
    }
}
