package classes;

/*
 * start time = 10:25 - 10:27   after thinking about it for like 75 minutes
 * end time =
 * total time = 77 minutes
 * speed = 8.15 %
 * memory = 40.4 %
 * notes:
 *  the brute force here is so simple, I wonder what the recursive answer was
 */
public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a1 = headA;
        ListNode b1 = headB;
        while(a1!=null) {
            while(b1!=null) {
                if(a1==b1) return a1;
                else {
                    b1=b1.next;
                }
            }
            a1 = a1.next;
            b1=headB;
        }
        return null;
    }
}
