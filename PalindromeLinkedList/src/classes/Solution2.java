package classes;

/**
 * time limit exceeded
 */
public class Solution2 {
    public boolean isPalindrome(ListNode head) {
        String forward = "";
        String backward = "";
        if(head.next==null) return true;
        if(head.next.next==null) {
                if(head.next.val==head.val) {
                    return true;
                } else {
                    return false;
                }
        }
        ListNode temp = head;
        while(temp!=null) {
            forward += ""+temp.val;
            temp=temp.next;
        }
        ListNode tail = switchLL(head);
        while(tail!=null) {
            backward +=""+tail.val;
            tail = tail.next;
        }
        return forward.equals(backward) ? true : false;
    }
    private ListNode switchLL(ListNode head) {
        ListNode back = head;
        ListNode mid = head.next;
        ListNode front = head.next.next;
        back.next = null;
        while(front!=null) {
            mid.next = back;
            back = mid;
            mid = front;
            front = front.next;
        }
        mid.next = back;
        return mid;
    }
}
