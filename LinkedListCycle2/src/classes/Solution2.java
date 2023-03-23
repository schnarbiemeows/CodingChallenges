package classes;

/**
 * based on other people's solutions, let's make Solution1 more efficient
 * bah,
 * speed = 34.43%
 * memory = 30.17%
 * so, the submission times are not correct
 */
public class Solution2 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) return true;
        }
        return false;
    }
}
