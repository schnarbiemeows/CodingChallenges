package classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 429
 * 2 mistakes;
 * 1.) Queues are implemented as LinkedLists, not ArrayLists
 * 2.) Solution 2 works - I had to add line 25 on Solution 2 - if (item!=null) {
 * then it submitted, and beat 84.75% of Solutions
 */


public class Solution {
	public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> upper = new LinkedList<Node>();
        Queue<Node> lower = new LinkedList<Node>();
        upper.add(root);
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        method(answer,upper,lower);
        return answer;
    }
    
    public void method(List<List<Integer>> answer,Queue<Node> upper, Queue<Node> lower) {
    	List<Integer> temp = new ArrayList<Integer>();
    	while(!upper.isEmpty()) {
    		Node item = upper.remove();
    		temp.add(item.val);
    		for(Node node : item.children) {
    			lower.add(node);
    		}
    	}
    	if(!temp.isEmpty()) {
    		answer.add(temp);
    		upper = lower;
    		lower = new LinkedList<Node>();
    		method(answer,upper,lower);
    	}
    }
}
