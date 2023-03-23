package classes;

public class Node {

    public int val;
    public Node prev;
    public Node next;
    public Node child;
    public Node(int val, Node child, Node next) {
        this.val=val;
        this.child = child;
        this.next = next;
    }
}
