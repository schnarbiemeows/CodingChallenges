package classes;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/* 
	 * first time, no errors, beat 73.21% of submissions
	 */
	List<Integer> solution = new ArrayList<Integer>();
	public List<Integer> preorder(Node root) {
		 pre(root);
         return solution;
    }
	
	public void pre(Node root) {
		if(root!=null) {
        	solution.add(root.val);
        	for(Node item : root.children) {
        		preorder(item);
        	}
        } 
	}
}
