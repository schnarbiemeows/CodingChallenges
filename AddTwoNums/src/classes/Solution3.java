package classes;

/**
 * makes much more sense now
 */
public class Solution3 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head = new ListNode();
        ListNode temp = head;
        head.val = (l1.val+l2.val)%10;
        int carry = (l1.val+l2.val)/10;
        while(l1.next!=null||l2.next!=null) {
            int sum = carry;
            if(l1.next!=null) {
                sum += l1.next.val;
                l1 = l1.next;
            }
            if(l2.next!=null) {
                sum+=l2.next.val;
                l2=l2.next;
            }
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            temp = temp.next;
        }
        if(carry==1) {
            temp.next = new ListNode(1);
        }
        return head;
    }
}
