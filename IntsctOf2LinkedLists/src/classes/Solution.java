package classes;

/*
 * start time = 9:04
 * end time =
 * total time =  minutes
 * speed =  %
 * memory =  %
 * notes:
 * I overthought this, see Solution2
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ans = new ListNode(0);
        // recursive
        if(headA.next==null&&headB.next==null) {
            if(headA==headB) {
                ans = headA;
                return ans;
            }
            else {
                return null;
            }
        } else {
            if(headA.next==null) {
                headB.next = getIntersectionNode(headA,headB.next);
                return headB;
            } else if(headB.next==null) {
                headA.next = getIntersectionNode(headA.next,headB);
                return headA;
            } else if(headA!=headB) {
                ans.next = getIntersectionNode(headA.next,headB.next);
            }
        }
        return ans;
    }
}
