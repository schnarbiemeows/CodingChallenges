package classes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/*
 * first submission, no errors, beat 25.41% of submissions
 * I wanted to try the iterative solution
 * second solution below is recursive and beat 44.77%
 */
public class Solution {
    public List<Integer> postorder(Node root) {
        Deque<Node> temp = new ArrayDeque<Node>();
        List<Integer> answer = new ArrayList<Integer>();
        if(root==null) return answer;
        temp.add(root);
        while(temp.size()>0) {
        	Node item = temp.removeFirst();
        	if(item.children.size()>0) {
        		for(Node child : item.children) {
        			temp.addFirst(child);
        		}
        	}
        	answer.add(item.val);
        }
        Collections.reverse(answer);
        return answer;
    }
}

/*import java.util.ArrayList;

class Solution {
    List<Integer> solution = new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        post(root);
        return solution;
    }
    
    public void post(Node root) {
		if(root!=null) {
        	for(Node item : root.children) {
        		postorder(item);
        	}
            solution.add(root.val);
        } 
	}
}*/