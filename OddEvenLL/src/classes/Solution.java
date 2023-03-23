package classes;

import java.util.Arrays;

/*
 *
 * speed = %
 * memory = %
 *
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next!=null&&head.next.next==null) return head; // zero, 1 or 2 elements, its already in order
        ListNode odd = head;
        ListNode even = null;
        ListNode fe = null;
        boolean done = false;
        while(!done&&odd!=null) {
            if(odd.next!=null&&odd.next.next!=null){
                if(even == null) {
                    even = odd.next;
                    fe = odd.next;
                    odd.next = odd.next.next;
                    odd = odd.next;
                } else {
                    even.next = odd.next;
                    odd.next = odd.next.next;
                    odd = odd.next;
                    even = even.next;
                }
            } else {
                even.next = odd.next;
                odd.next = fe;
                done = true;
            }
        }
        return head;
    }

}
