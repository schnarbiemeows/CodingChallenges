package classes;

/*
 * start time = 4:04
 * end time = 4:28
 * total time = 24 minutes
 * speed = 100% !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * memory = 89.34 %
 * notes:
 * wow! great! a medium in 24 minutes!!!!!! only 1 submission too!
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(k==0) return head;
        ListNode temp = head;
        int count = 0;
        while(temp.next!=null) {
            count++;
            temp = temp.next;
        }
        count++;
        //System.out.println("count = " + count);
        ListNode tail = temp;
        temp = head;
        int reealShift = k%count;
        if(reealShift==0) return head;
        reealShift = count-reealShift;
        if(head.next==null) return head;
        while(reealShift>1) {
            temp = temp.next;
            reealShift--;
        }
        //System.out.println("node value here is : " + temp.val);
        tail.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
}
