package main;

import classes.ListNode;
import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - MEDIUM
	 * description:
	 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
	 * constraints:
	 * The number of nodes in the list is sz.
		1 <= sz <= 30
		0 <= Node.val <= 100
		1 <= n <= sz
	 */
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int nodeNumber = 2;
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		/*ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);*/
		n1.next = n2;
		/*n2.next = n3;
		n3.next = n4;
		n4.next = n5;*/
		System.out.println(sol.removeNthFromEnd(n1,nodeNumber).val);
	}

}
