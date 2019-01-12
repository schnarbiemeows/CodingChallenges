package classes;

/*
 * first submission, no errors, no comparitive submission data
 * 1 small ommission from the text file
 */
public class Solution {

	public int maxDepth(Node root) {
        if(root==null) return 0;
        return depth(root);
    }
    
    private int depth(Node currentNode) {
    	if(currentNode.children==null||currentNode.children.isEmpty()) return 1;
    	int depth = 0;
    	for(Node child : currentNode.children) {
    		depth = Math.max(depth(child),depth);
    	}
    	return 1+depth;
    }
}
