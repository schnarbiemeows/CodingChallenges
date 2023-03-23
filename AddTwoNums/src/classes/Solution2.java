package classes;

/**
 *
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder num1str = new StringBuilder();
        StringBuilder num2str = new StringBuilder();
        while(l1!=null) {
            num1str = num1str.append(l1.val);
            l1 = l1.next;
        }
        while(l2!=null) {
            num2str = num2str.append(l2.val);
            l2 = l2.next;
        }
        long num1 = new Long(num1str.reverse().toString());
        long num2 = new Long(num2str.reverse().toString());
        System.out.println("num1 = " + num1 + " , num2 = " + num2);
        long ans = num1 + num2;
        System.out.println("ans = " + ans);
        String ansstr = ans+"";
        ListNode ansList = new ListNode(ansstr.charAt(ansstr.length()-1)-'0');
        ListNode anshead = ansList;
        if(ansstr.length()>1) {
            for(int i=ansstr.length()-2;i>=0;i--) {
                ansList.next = new ListNode(ansstr.charAt(i)-'0');
                ansList = ansList.next;
            }
        }

        return anshead;
    }
}
