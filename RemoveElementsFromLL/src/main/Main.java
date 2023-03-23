package main;

import classes.ListNode;
import classes.Solution;
import classes.Solution2;

public class Main {

	/**
	 *
	 * difficulty - EASY
	 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has
	 * Node.val == val, and return the new head.
	 * constraints:
	 * The number of nodes in the list is in the range [0, 104].
	 * 1 <= Node.val <= 50
	 * 0 <= val <= 50
	 */
	public static void main(String[] args) {

		int nodeNumber = 2;
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		Solution sol = new Solution();
		System.out.println(sol.removeElements(n1,nodeNumber));
	}

}
