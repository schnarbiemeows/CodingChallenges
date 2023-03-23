package main;

import classes.Solution;
import classes.Node;

public class Main {

	/**
	 * 138
	 * difficulty - MEDIUM
	 * description:
	 * A linked list of length n is given such that each node contains an additional random pointer,
	 * which could point to any node in the list, or null.
	 *
	 * Construct a deep copy of the list.
	 * The deep copy should consist of exactly n brand new nodes, where each new node has its value set to
	 * the value of its corresponding original node.
	 * Both the next and random pointer of the new nodes should point to new nodes in the copied list
	 * such that the pointers in the original list and copied list represent the same list state.
	 * None of the pointers in the new list should point to nodes in the original list.
	 *
	 * For example, if there are two nodes X and Y in the original list, where X.random --> Y,
	 * then for the corresponding two nodes x and y in the copied list, x.random --> y.
	 *
	 * Return the head of the copied linked list.
	 *
	 * The linked list is represented in the input/output as a list of n nodes.
	 * Each node is represented as a pair of [val, random_index] where:
	 *
	 * val: an integer representing Node.val
	 * random_index: the index of the node (range from 0 to n-1) that the random pointer points to,
	 * 	or null if it does not point to any node.
	 * Your code will only be given the head of the original linked list.
	 *
	 * constraints:
	 * 0 <= n <= 1000
	 * -104 <= Node.val <= 104
	 * Node.random is null or is pointing to some node in the linked list.
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		Node head = new Node(1,new Node(2, new Node(3, new Node(4, new Node(5)))));
		head.random = head.next.next;	// 1 points to 3
		head.next.random = head;		// 2 points to 1
		head.next.next.random = head.next.next;		// 3 points to 3
		head.next.next.next.next.random = head.next.next.next;	// 5 points to 4
		Node ans = sol.copyRandomList(head);
		while(ans!=null) {
			System.out.print(ans.val+",");
			ans = ans.next;
		}
	}

}
