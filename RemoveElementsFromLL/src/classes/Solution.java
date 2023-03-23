package classes;

import java.util.Arrays;

/*
 * 11:58 - 12:18
 * speed = 98.98%
 * memory = 87.77%
 *
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val==val) {      // what if head=null or head has multiple instances of val at the beginning?
            head=head.next;
        }
        if(head==null) return head;
        ListNode temp = head;   // at this point, the head is not val
        while(temp!=null&&temp.next!=null) {
            while(temp.next!=null&&temp.next.val==val) {
                temp.next = temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }

}
