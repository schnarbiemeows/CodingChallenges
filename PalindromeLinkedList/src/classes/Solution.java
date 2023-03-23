package classes;

/*
 * 1:35
 */
public class Solution {

    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        ListNode temp = head;
        int count = 0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }   // get the depth of the thing
        int[] ftob = new int[count];
        temp = head;
        for(int any=0;any<ftob.length;any++) {
            ftob[any] = temp.val;
            temp = temp.next;
        }
        for(int i=0;i<ftob.length;i++) {
            if(ftob[i]!=ftob[(ftob.length-1)-i]) return false;
        }
        return true;
    }
}

