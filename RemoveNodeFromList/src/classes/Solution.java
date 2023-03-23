package classes;

/*
 * start time = 11:22
 * end time = 11:46
 * total time = 24 minutes
 * speed = 80.78 %
 * memory = 47.97 %
 * notes:
 * 1. go from end to end to count the size of the list
 * 2. we are removing the nth from from the tail, so go to the node(size-n) and remove it
 * 3. write a remove method
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1 = head;
        int size = 0;
        while(l1!=null) {
            size++;
            l1 = l1.next;
        }
        if(size==1) return null;
        if(size==n) {
            head = head.next;
            return head;
        }
        l1 = head;
        ListNode l2 = l1;
        while(size-n>1) {
            l1 = l1.next;
            size--;
        }
        if(l1.next!=null) {
            l1.next = l1.next.next;
        }
        else {
            l1.next=null;
        }
        return l2;
    }
}
