package classes;

/*
 * first submission, no errors, but only beat 9.46% of submissions
 */
public class RecentCounter {

	Node head = null;
	
	class Node {
		int val;
		Node next;
		public Node(int val) {
			super();
			this.val = val;
			next = null;
		}
		
	}
	public RecentCounter() {
        
    }
    
    public int ping(int t) {
    	int counter = 0;
        Node item = new Node(t);
        if(head==null) {
        	head = item;
        	return 1;
        }
        item.next=head;
    	head = item;
    	Node current = head;
        while(current!=null&&head.val-current.val<=3000) {
        	counter++;
        	current=current.next;
        }
        return counter;
    }
}
