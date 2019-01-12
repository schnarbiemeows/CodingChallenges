package classes;

/*
 * one small error:
 * had int halfwaypoint = count/2+count%2;
 * should have been int halfwaypoint = count/2+1;
 * but irst submission, no errors, no comparison available
 */
public class Solution {

	public ListNode middleNode(ListNode head) {
        if(head.next==null) return head;
        ListNode current = head;
        int count = 0;
        while(current!=null) {
        	count++;
        	current = current.next;
        }
        int halfwaypoint = count/2+1;
        current = head;
        while(halfwaypoint>1) {
        	current=current.next;
        	halfwaypoint--;
        }
        return current;
    }
}
