package classes;

import java.util.LinkedList;
import java.util.Queue;

/*
 * second submission, no errors, but only beat 28.05% of submissions
 */
public class RecentCounter2 {

	Queue<Integer> pings =  new LinkedList<Integer>();
	
	public RecentCounter2() {
        
    }
    
    public int ping(int t) {
    	pings.add(t);
    	while(pings.peek()!=null&&(t-pings.peek()>3000)) pings.poll();
    	return pings.size();
    }
}
