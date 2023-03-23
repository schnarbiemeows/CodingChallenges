package main;

import classes.ListNode;
import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - MEDIUM
	 * description:
	 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
	 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
	 * following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer
	 * is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
	 * Do not modify the linked list.
	 * constraints:
	 * The number of the nodes in the list is in the range [0, 10^4].
	 * -10^5 <= Node.val <= 10^5
	 * pos is -1 or a valid index in the linked-list.
	 */
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		ListNode head = new ListNode(0);
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n4;
		System.out.println(sol.detectCycle(head).val);
		n4.next = null;
		System.out.println(sol.detectCycle(head));
		head.next = null;
		System.out.println(sol.detectCycle(head));
		head = null;
		System.out.println(sol.detectCycle(head));
	}

}
