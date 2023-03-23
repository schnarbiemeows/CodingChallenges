package classes;

/**
 * speed = 82.48%
 * memory = 74.41%
 */
public class Solution2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode head = null;
            if(list1==null&&list2==null) return null;   // if initiall lists are null
            if(list1==null) return list2;               // if one ends before the other
            if(list2==null) return list1;               // if one ends before the other
            if (list1.val < list2.val) {
                head = list1;
                head.next = mergeTwoLists(list1.next,list2) ;
            } else {
                head = list2;
                head.next = mergeTwoLists(list1,list2.next);
            }
            return head;
    }
}
