package main;

import classes.ListNode;
import classes.Solution;

public class Main {

	/**
	 *
	 * difficulty - MEDIUM
	 * description:
	 * Given the head of a linked list, rotate the list to the right by k places.
	 * constraints:
	 * The number of nodes in the list is in the range [0, 500].
	 * -100 <= Node.val <= 100
	 * 0 <= k <= 2 * 10^9 			// so we have to modulus
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		head = new ListNode(0,new ListNode(1,new ListNode(2,null)));
		int k = 4;
		ListNode ans = sol.rotateRight(head,k);
		while(ans!=null) {
			System.out.print(ans.val+",");
			ans = ans.next;
		}

	}

}
