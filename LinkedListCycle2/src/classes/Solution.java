package classes;

/*
 * start time = 6:22
 * end time = 7:22
 * total time = 60 minutes, but I got it right the first submission
 * took me about 30 minutes to figure out how to solve it
 * speed = 5.11 %
 * memory = 89.71 %
 * notes:
 * fak, how do I figure out the pos?
 * it has to have something to do with:
 *  we use 3 pointers:
 * slow
 * fast
 * actual
 * so, when fast and slow first meet, we know there is a loop, then
 * start incrementing actual by 1, and after each time, do a complete loop of fast meeting slow again
 * then, the first time fast meets actual, it will be on the entry node, return that node
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) return findActual(head,fast,slow);
        }
        return null;
    }

    private ListNode findActual(ListNode head, ListNode fast, ListNode slow) {
        ListNode  actual = head;
        if(fast==actual||fast.next==actual) return actual;
        if(fast.next==actual.next) return actual.next;
        while(fast!=actual) {
            do {
                fast=fast.next;
                if(actual==fast) {
                    return actual;
                }
            } while(fast!=slow);
            actual = actual.next;
        }
        return actual;
    }
}
