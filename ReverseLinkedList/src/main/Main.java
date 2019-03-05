package main;

import classes.ListNode;
import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * 206
	 * difficulty - EASY
	 * Reverse a singly linked list.
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
		Solution2 sol2 = new Solution2();
		head = sol2.reverseList(first);
		while(head!=null) {
			System.out.println(head.val+", ");
			head=head.next;
		}
	}

}
