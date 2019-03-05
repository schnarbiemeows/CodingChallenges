package classes;

/*
 * 206
 * man, had to think about it for an hour, but finally got first submission right
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
 * Memory Usage: 37.9 MB, less than 9.41% of Java online submissions for Reverse Linked List.
 */
public class Solution {

	public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        return switchNode(null,head,head.next);
    }
    
    public ListNode switchNode(ListNode current, ListNode middle, ListNode end) {
    	middle.next = current;
    	if(end==null) return middle;
    	else return switchNode(middle, end, end.next);
    }
}
