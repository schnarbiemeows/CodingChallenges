package classes;

import java.util.HashMap;
import java.util.Map;

/*
 * start time = 3:15
 * end time = 3:47
 * total time = 32 minutes
 * speed = 65.1 %
 * memory = 8.72 %
 * notes:
 *  so, it looks like I can do this in 2 steps:
 * 1. make the cloned list without the random pointers set
 * 2. since the requirements are telling me that the pointer will be given as the index (and not the actual node
 *      then I can just do a second iteration to set the pointers
 *  GREAT! only 1 submission! only 32 minues
 * had to read the hints tho, which mentioned the mapping thing
 */
public class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node newHead = clone(head);
        Map<Node,Node> mapping = new HashMap();
        mapNodes(head,newHead,mapping);
        mapPointers(head,newHead,mapping);
        return newHead;
    }

    private void mapPointers(Node head, Node newHead, Map<Node, Node> mapping) {
        while(head!=null) {
            if(head.random!=null) {
                newHead.random = mapping.get(head.random);
            }
            head=head.next;
            newHead=newHead.next;
        }
    }

    private void mapNodes(Node head, Node newHead, Map<Node, Node> mapping) {
        while(head!=null) {
            mapping.put(head,newHead);
            head=head.next;
            newHead=newHead.next;
        }
    }

    private Node clone(Node head) {
        Node newHead = new Node(head.val);
        Node temp = newHead;
        while(head.next!=null) {
            temp.next = new Node(head.next.val);
            head=head.next;
            temp = temp.next;
        }
        return newHead;
    }
}
