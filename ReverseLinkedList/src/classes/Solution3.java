package classes;

/**
 * redoing this so that I finally remember:
 * 3 pointer, start, middle, end
 * middle = head, start = null, end = head.next
 * switch then shift right, shift right, shift right, until end = null
 *
 * so, 3-pointers, switch,shift,shift,shift
 */
public class Solution3 {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next == null) return head;
        ListNode lback = null;
        ListNode lmiddle = head;
        ListNode lfront = head.next;
        while(lfront!=null) {
            lmiddle.next = lback;       // switch
            lback=lmiddle;              // shift
            lmiddle = lfront;           // shift
            lfront = lfront.next;       // shift
        }
        lmiddle.next = lback;
        return lmiddle;
    }
}
