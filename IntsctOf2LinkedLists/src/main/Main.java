package main;

import classes.ListNode;
import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - EASY
	 * description:
	 * Given the heads of two singly linked-lists headA and headB, return
	 *
	 * the node at which the two lists intersect.
	 *
	 * If the two linked lists have no intersection at all, return null.
	 * The test cases are generated such that there are no cycles anywhere in the entire linked structure.
	 * Note that the linked lists must retain their original structure after the function returns.
	 * constraints:
	 * The number of nodes of listA is in the m.
		The number of nodes of listB is in the n.
		1 <= m, n <= 3 * 10^4		30000 nodes each potentially
		1 <= Node.val <= 10^5
		0 <= skipA < m
		0 <= skipB < n
		intersectVal is 0 if listA and listB do not intersect.
		intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.
	 */
	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();
		ListNode head3 = new ListNode(8);
		ListNode n2 = new ListNode(7);
		ListNode n3 = new ListNode(5);
		head3.next = n2;
		n2.next = n3;
		ListNode a1 = new ListNode(4);
		ListNode a2 = new ListNode(1);
		a1.next = a2;
		a2.next = head3;
		ListNode b1 = new ListNode(2);
		ListNode b2 = new ListNode(3);
		ListNode b3 = new ListNode(6);
		b1.next = b2;
		b2.next = b3;
		b3.next = head3;
		System.out.println(sol.getIntersectionNode(a1,b1).val);
		/*n4.next = null;
		System.out.println(sol.hasCycle(head));
		head.next = null;
		System.out.println(sol.hasCycle(head));
		head = null;
		System.out.println(sol.hasCycle(head));*/
	}

}
