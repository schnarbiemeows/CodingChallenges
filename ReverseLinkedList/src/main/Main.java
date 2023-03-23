package main;

import classes.ListNode;
import classes.Solution;
import classes.Solution2;
import classes.Solution3;

public class Main {

	/*
	 * 206
	 * difficulty - EASY
	 * Reverse a singly linked list.
	 * The number of nodes in the list is the range [0, 5000].
	 * -5000 <= Node.val <= 5000
	 */
	public static void main(String[] args) {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		fifth.next=null;
		fourth.next=fifth;
		third.next=fourth;
		second.next=third;
		first.next=second;
		ListNode head = first;
		while(head!=null) {
			System.out.println(head.val+", ");
			head=head.next;
		}
		Solution3 sol2 = new Solution3();
		head = sol2.reverseList(first);
		while(head!=null) {
			System.out.println(head.val+", ");
			head=head.next;
		}
	}

}
