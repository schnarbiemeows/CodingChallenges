package main;

import classes.ListNode;
import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - 
	 * description:
	 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
	 * There is a cycle in a linked list if there is some node in the list that can be reached again
	 * by continuously following the next pointer. Internally, pos is used to denote the index of the node
	 * that tail's next pointer is connected to. Note that pos is not passed as a parameter.
	 * Return true if there is a cycle in the linked list. Otherwise, return false.
	 * constraints:
	 * The number of the nodes in the list is in the range [0, 104].
	 * -105 <= Node.val <= 105
	 * pos is -1 or a valid index in the linked-list.
	 */
	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();
		ListNode head = new ListNode(3);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(0);
		ListNode n4 = new ListNode(4);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n2;
		System.out.println(sol.hasCycle(head));
		n4.next = null;
		System.out.println(sol.hasCycle(head));
		head.next = null;
		System.out.println(sol.hasCycle(head));
		head = null;
		System.out.println(sol.hasCycle(head));
	}

}
