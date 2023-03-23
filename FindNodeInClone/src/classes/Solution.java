package classes;

import java.util.HashMap;
import java.util.Map;

/*
 * start time =
 * end time =
 * total time =  minutes
 * speed = 90.59 %
 * memory = 54.77 %
 * notes:
 *
 */
public class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original==null) return null;
        if(original==target) return cloned;
        else {
            TreeNode node = getTargetCopy(original.left,cloned.left,target);
            if(node!=null) return node;
            else {
                node = getTargetCopy(original.right,cloned.right,target);
                if(node!=null) return node;
            }
        }
        return null;
    }
}
