package classes;

/**
 * 2 pointer solution
 * geezuz
 * speed = 100%
 * memory = 93.11%
 * BUT this took forever to get the edge cases correct
 */
public class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;        // edge case where there is only 1 item; constraints say that in this case
                                                // n MUST BE 1
        ListNode slow = head;
        ListNode fast = head;
        for(int i = n;i>0;i--) {
            fast = fast.next;
        }
        while(fast!=null&& fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //if(slow==head) return head.next;
        if(fast==null) {                        // edge case where they want to remove either the 1st item, or the last
            if(slow==head) return head.next;    // if its the first
            slow.next=null;                     // if its the last
        } else {
            slow.next = slow.next.next;         // normal case
        }
        return head;
    }
}
