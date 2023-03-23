package main;

import classes.ListNode;
import classes.Solution;

public class Main {

	/*
	 * difficulty - 
	 * 
	 */
	public static void main(String[] args) {
		ListNode input = new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(1))));
		Solution sol = new Solution();
		System.out.println(sol.isPalindrome(input));
	}

}
