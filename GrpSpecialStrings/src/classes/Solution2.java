package classes;

import java.util.Arrays;

/*
 * 893 - had two errors, horrible, only beat 1.92% of submissions
 */
public class Solution2 {

	public int numSpecialEquivGroups(String[] A) {
        if(A.length==1) return 1;
        int[] used = new int[A.length];
        int counter = 0;
        for(int i=0;i<A.length;i++) {
        	if(used[i]==0) {
        		used[i]=1;
        		counter++;
        		for(int j=i+1;j<A.length;j++) {
        			if(used[j]==0) {
        				//if(Collections.sort) 
        				{
        					
        				}
        			}
        		}
	        }
        
        }
        return counter;
    }
    
}
