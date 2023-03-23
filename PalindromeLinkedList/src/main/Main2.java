package main;

import classes.ListNode;
import classes.Solution;
import classes.Solution2;

/*
 * difficulty - EASY
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 * The number of nodes in the list is in the range [1, 105].
    0 <= Node.val <= 9
 */
public class Main2 {

    public static void main(String[] args) {
        ListNode input = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(1))));
        Solution2 sol = new Solution2();
        System.out.println(sol.isPalindrome(input));
    }
}
