package classes;

/*
 * start time = 10:27 - 10:52
 * end time = 28 minutes
 * total time =  minutes
 * speed = 6.61 %
 * memory = 39.67 %
 * notes:
 * slow as hell
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode ans = null;
        if(list1.val<list2.val) {
            ans = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            ans = new ListNode(list2.val);
            list2 = list2.next;
        }
        ListNode head = ans;
        while(list1!=null&&list2!=null) {
            if(list1.val<list2.val) {
                while(list1!=null&&list1.val<list2.val) {
                    ans.next = new ListNode(list1.val);
                    ans = ans.next;
                    list1 = list1.next;
                }
                ans.next = new ListNode(list2.val);
                ans = ans.next;
                list2 = list2.next;
            } else {
                while(list2!=null&&list2.val<list1.val) {
                    ans.next = new ListNode(list2.val);
                    ans = ans.next;
                    list2 = list2.next;
                }
                ans.next = new ListNode(list1.val);
                ans = ans.next;
                list1 = list1.next;
            }
        }
        if(list1!=null) {
            while(list1!=null) {
                ans.next = new ListNode(list1.val);
                ans = ans.next;
                list1 = list1.next;
            }
        } else if(list2!=null) {
            while(list2!=null) {
                ans.next = new ListNode(list2.val);
                ans = ans.next;
                list2 = list2.next;
            }
        }
        return head;
    }
}
