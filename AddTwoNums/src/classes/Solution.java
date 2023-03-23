package classes;

/*
 * start time = 9:20
 * end time = 10:55
 * total time =  95 minutes!!! really bad
 * speed = 81.55 %
 * memory = 45.22 %
 * notes:
 *  what is fucking me up about this is that.....
 *  ... if I look at the constraint...
 *
 * "The number of nodes in each linked list is in the range [1, 100]."
 *
 * I should know IMMEDIATELY that I cannot convert these lists of numbers to ints or even longs
 * because they could be representing a number with a 100 digits!
 * so I have to work with Strings only
 * I started by doing that in this class, but because I DID NOT carefully read the constraints,
 * I ended up going off on a tangent with Solution2 using all manner of int and long solutions
 * because I thought it would be easier!
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = null;
        ListNode answerhead = null;
        ListNode head1 = l1;
        ListNode head2 = l2;
        int carry = 0;
        while(head1!=null&&head2!=null) {
            int temp = carry;
            carry = 0;
            int sume = temp+head1.val  + head2.val;
            if(answer==null) {
                answer = new ListNode((temp+head1.val  + head2.val)%10);
                answerhead = answer;
            } else {
                answer.next = new ListNode((temp+head1.val  + head2.val)%10);
                answer = answer.next;
            }
            if((temp+head1.val  + head2.val)/10>0) {
                carry=1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1!=null) {
            while(head1!=null) {
                answer.next = new ListNode((carry+head1.val)%10);
                answer = answer.next;
                if((carry+head1.val)/10>0) {
                    carry=1;
                } else {
                    carry=0;
                }
                head1 = head1.next;
            }
        } else if(head2!=null) {
            while(head2!=null) {
                answer.next = new ListNode((carry+head2.val)%10);
                answer = answer.next;
                if((carry+head2.val)/10>0) {
                    carry=1;
                } else {
                    carry=0;
                }
                head2 = head2.next;
            }
        }
        if(carry==1) {
            answer.next = new ListNode(1);
        }
        return answerhead;
    }
}
