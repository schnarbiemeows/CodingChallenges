package main;

import classes.ListNode;
import classes.Solution;
import classes.Solution2;

public class Main {

	/**
	 *
	 * difficulty - EASY
	 * Given the head of a singly linked list, group all the nodes with odd indices together
	 * followed by the nodes with even indices, and return the reordered list.
	 *
	 * The first node is considered odd, and the second node is even, and so on.
	 *
	 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
	 *
	 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
	 *
	 * constraints:
	 * The number of nodes in the linked list is in the range [0, 10^4].
	 * -106 <= Node.val <= 106
	 */
	public static void main(String[] args) {

		int nodeNumber = 2;
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		//ListNode n6 = new ListNode(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		//n5.next = n6;
		Solution sol = new Solution();
		System.out.println(sol.oddEvenList(n1));
	}

}
