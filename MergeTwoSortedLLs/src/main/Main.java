package main;

import classes.BestSolution;
import classes.ListNode;
import classes.Solution;
import classes.Solution2;

public class Main {

	/*
		21
	 * difficulty - EASY
	 * description:
	 * You are given the heads of two sorted linked lists list1 and list2.
	 	Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
		Return the head of the merged linked list.
	 * constraints:
	 *	The number of nodes in both lists is in the range [0, 50]
	 	-100 <= Node.val <= 100
		Both list1 and list2 are sorted in non-decreasing order.
	 */
	public static void main(String[] args) {

		Solution2 sol = new Solution2();
		ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(1)));
		ListNode l2 = new ListNode(2, new ListNode(2, new ListNode(2)));
		ListNode l3 = sol.mergeTwoLists(l1,l2);
		while(l3!=null) {
			System.out.print(l3.val+",");
			l3=l3.next;
		}
		System.out.println();
		l1 = new ListNode(1, new ListNode(3, new ListNode(5)));;
		l2 = new ListNode(2, new ListNode(4, new ListNode(6)));;
		l3 = sol.mergeTwoLists(l1,l2);
		while(l3!=null) {
			System.out.print(l3.val+",");
			l3=l3.next;
		}
		System.out.println();
		l1 = null;
		l2 = new ListNode(2, new ListNode(4, new ListNode(6)));;
		l3 = sol.mergeTwoLists(l1,l2);
		while(l3!=null) {
			System.out.print(l3.val+",");
			l3=l3.next;
		}
		System.out.println();
		l1 = null;
		l2 = null;
		l3 = sol.mergeTwoLists(l1,l2);
		while(l3!=null) {
			System.out.print(l3.val+",");
			l3=l3.next;
		}
		System.out.println();
		l1 = new ListNode(1, new ListNode(10));;
		l2 = new ListNode(2, new ListNode(4, new ListNode(6)));;
		l3 = sol.mergeTwoLists(l1,l2);
		while(l3!=null) {
			System.out.print(l3.val+",");
			l3=l3.next;
		}
	}

}
