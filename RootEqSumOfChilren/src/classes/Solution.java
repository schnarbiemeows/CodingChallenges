package classes;

/*
 * start time = 9:51
 * end time = 9:56
 * total time = 5 minutes(including time to create TreeNode)
 * speed = 80.74 %
 * memory = 65.25 %
 * notes:
 *
 */
public class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val+root.right.val;
    }
}
