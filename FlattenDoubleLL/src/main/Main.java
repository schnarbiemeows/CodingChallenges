package main;

import classes.Node;
import classes.Solution;

public class Main {

	/**
	 *
	 * difficulty - MEDIUM
	 * description:
	 * You are given a doubly linked list, which contains nodes that have a next pointer,
	 * a previous pointer, and an additional child pointer.
	 * This child pointer may or may not point to a separate doubly linked list, also containing these special nodes.
	 * These child lists may have one or more children of their own, and so on,
	 * to produce a multilevel data structure as shown in the example below.
	 *
	 * Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level,
	 * doubly linked list. Let curr be a node with a child list.
	 * The nodes in the child list should appear after curr and before curr.next in the flattened list.
	 *
	 * Return the head of the flattened list.
	 * The nodes in the list must have all of their child pointers set to null.
	 *
	 * constraints:
	 *	The number of Nodes will not exceed 1000.
	 * 1 <= Node.val <= 10^5
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		Node child2 = new Node(3,null,null);
		Node child1 = new Node(2,child2,null);
		Node head = new Node(1,child1,null);
		Node ans = sol.flatten(head);
		while(ans!=null) {
			System.out.print(ans.val);
			ans = ans.next;
		}
		System.out.println();
	}

}
