package classes;

/**
 * this is not my code
 * this beats 99.56%
 * what this guy does is simple:
 * 1. he goes to the tail for each list, counting the # of nodes, count1, count2
 * 2. he goes back to the start again, and then, depending on which list is longer, he moves it up ABS(count2 - count1)
 *      so that they are now equal distance from the tail
 * 3. he simple moves them both up until they are pointing to the same node, that is the node
 */
public class BestSolution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        int len1 = 0, len2 = 0;
        while (p1 != null) {
            p1 = p1.next;
            len1++;
        }
        while (p2 != null) {
            p2 = p2.next;
            len2++;
        }
        p1 = headA;
        p2 = headB;
        if (len1 > len2) {
            for (int i = 0;i < len1 - len2; i++) {
                p1 = p1.next;
            }
        } else {
            for (int i = 0;i < len2 - len1; i++) {
                p2 = p2.next;
            }
        }
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
