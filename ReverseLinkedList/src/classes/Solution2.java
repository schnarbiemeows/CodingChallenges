package classes;

/*
 * 206
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
 * Memory Usage: 37.9 MB, less than 12.15% of Java online submissions for Reverse Linked List.
 */
public class Solution2 {

	public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode start = null;
        ListNode middle = head;
        ListNode end = head.next;
        while(end!=null) {
        	middle.next = start;
        	start=middle;
        	middle=end;
        	end=end.next;
        }
        middle.next = start;
        return middle;
    }
    
}
