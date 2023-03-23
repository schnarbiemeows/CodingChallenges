package classes;

/*
 * start time = 10:06 - 11:58
 * end time = 11:58
 * total time = 112 minutes
 * speed = 5.64 %
 * memory = 72.58 %
 * notes:
 * holy crap, that took a long  time, with 3 wrong submissions , 2 of which were simply B/C I forgot to account for
 * head = null
 */
public class Solution {
    /**
     * recursive solution
     * @param head
     * @return
     */
    public Node flatten(Node head) {
        if(head==null) return head;
        Node temp = head;
        while(temp.next!=null||temp.child!=null) {
            if(temp.child!=null) {
                Node temptemp = temp.next;
                temp.next = temp.child;
                temp.child.prev = temp;
                Node tail = getChildTail(temp.child);
                tail.next = temptemp;
                if(temptemp!=null) {
                    temptemp.prev = tail;
                }
                temp.child = null;
            } else {
                temp=temp.next;
            }
        }
        return head;
    }

    private Node getChildTail(Node child) {
        Node temp = child;
        while(temp.next!=null||temp.child!=null) {
            if(temp.child!=null) {
                Node temptemp = temp.next;
                temp.next = temp.child;
                temp.child.prev = temp;
                Node tail = getChildTail(temp.child);
                tail.next = temptemp;
                if(temptemp!=null) {
                    temptemp.prev = tail;
                }
                temp.child = null;
            } else {
                temp=temp.next;
            }
        }
        return temp;
    }


}
