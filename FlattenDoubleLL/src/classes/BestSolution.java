package classes;

/**
 * this is not my code, but is similar
 * beats 100%
 */
public class BestSolution {
    public Node flatten(Node head) {
        Node h = head;
        myflatten(head);
        return h;
    }
    public Node myflatten(Node head) {
        Node prevN = null;
        while(head != null)
        {
            Node nextNode = head.next;
            if(head.child != null)
            {
                head.next = head.child;
                head.child.prev = head;
                Node cNode = head.child;
                head.child = null;
                Node childTail = myflatten(cNode);
                if(nextNode == null)
                    return head;
                childTail.next = nextNode;
                nextNode.prev = childTail;
                head = nextNode;
                continue;
            }

            prevN = head;
            head = head.next;
        }
        return prevN;
    }
}
