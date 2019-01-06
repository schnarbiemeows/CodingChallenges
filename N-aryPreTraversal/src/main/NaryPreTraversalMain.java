package main;

import java.util.ArrayList;
import java.util.List;

import classes.Node;
import classes.Solution;

public class NaryPreTraversalMain {

	public static void main(String[] args) {
		Node node6 = new Node(6,new ArrayList<Node>());
		Node node5 = new Node(5,new ArrayList<Node>());
		List<Node> items = new ArrayList<Node>();
		items.add(node5);
		items.add(node6);
		Node node3 = new Node(3,items);
		Node node2 = new Node(2,new ArrayList<Node>());
		Node node4 = new Node(4,new ArrayList<Node>());
		List<Node> items2 = new ArrayList<Node>();
		items2.add(node3);
		items2.add(node2);
		items2.add(node4);
		Node node1 = new Node(1,items2);
		Solution sol = new Solution();
		List<Integer> solution = sol.preorder(node2);
		for(Integer item : solution) {
			System.out.print(item.intValue()+", ");
		}
	}

}
