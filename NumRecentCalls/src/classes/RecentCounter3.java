package classes;

import java.util.LinkedList;
import java.util.Queue;

/*
 * third submission, this one beats 94.03% of all submissions
 */
public class RecentCounter3 {

	final int LIMIT = 3000;
    Queue<Integer> myQueue;
	
	public RecentCounter3() {
		myQueue = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
    	// Add value to queue
        myQueue.add(t);
	// Remove the unneeded numbers from the left
        while(myQueue != null){
            if(myQueue.peek() >= t - LIMIT)
                break;
            myQueue.poll();
        }
	// Return size of queue
        return myQueue.size();
    }
}
