package main;

import classes.ListNode;
import classes.Solution;
import classes.Solution2;
import classes.Solution3;

public class Main {

	/*
	 * difficulty - EASY
	 * description:
	 *	You are given two non-empty linked lists representing two non-negative integers.
	 * 	The digits are stored in reverse order, and each of their nodes contains a single digit.
	 * 	Add the two numbers and return the sum as a linked list.
	 * 	You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	 *
	 * constraints:
	 *	The number of nodes in each linked list is in the range [1, 100].
		0 <= Node.val <= 9
		It is guaranteed that the list represents a number that does not have leading zeros.
	 */
	public static void main(String[] args) {
		ListNode n1 = new ListNode(2,new ListNode(4, new ListNode(3)));
		ListNode n2 = new ListNode(5,new ListNode(6, new ListNode(4)));
		Solution3 sol = new Solution3();
		ListNode ans = sol.addTwoNumbers(n1,n2);
	}

}
