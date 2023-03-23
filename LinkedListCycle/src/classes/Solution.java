package classes;

/*
 * start time = 5:46
 * end time = 6:09
 * total time = 23 minutes
 * speed = 24.75 %
 * memory = 41.65 %
 * notes:
 * realtively easy, the scores are low because I am doing it using objects
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode fast = head.next;
        if(fast==null) return false;
        ListNode slow = head;
        while(fast.next!=null&&fast.next.next!=null) {
            if(fast.next==slow.next||fast.next.next==slow.next) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
