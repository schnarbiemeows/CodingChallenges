package classes;

import java.util.Arrays;

/*
 * 893 - had two errors, horrible, only beat 1.92% of submissions
 */
public class Solution {

	public int numSpecialEquivGroups(String[] A) {
        if(A.length==1) return 1;
        int[] used = new int[A.length];
        int counter = 0;
        for(int i=0;i<A.length;i++) {
        	if(used[i]==0) {
        		used[i]=1;
        		counter++;
        		char[] word1 = A[i].toCharArray();
        		for(int j=i+1;j<A.length;j++) {
        			if(used[j]==0) {
	        			char[] word2 = A[j].toCharArray();
	        			boolean same = false;
	        			// evens
	        			int evenslength=word1.length/2,oddslength=word1.length/2;
	        			if(word1.length%2==1) oddslength++;
	        			char[] word1evens = new char[evenslength];
	        			char[] word1odds = new char[oddslength];
	        			char[] word2evens = new char[evenslength];
	        			char[] word2odds = new char[oddslength];
	        			for(int w1e = 0;w1e<word1evens.length;w1e++) {
	        				word1evens[w1e]=word1[2*w1e+1];
	        				word2evens[w1e]=word2[2*w1e+1];
	        			}
	        			for(int w1o = 0;w1o<word1odds.length;w1o++) {
	        				word1odds[w1o]=word1[2*w1o];
	        				word2odds[w1o]=word2[2*w1o];
	        			}
	        			Arrays.sort(word1evens);
	        			Arrays.sort(word1odds);
	        			Arrays.sort(word2evens);
	        			Arrays.sort(word2odds);
	        			boolean evensequal = true,oddequal=true;
	        			for(int z=0;z<word1evens.length;z++) {
	        				if(word1evens[z]!=word2evens[z]) {
	        					evensequal=false;
	        					break;
	        				}
	        			}
	        			if(evensequal) {
	        				for(int z=0;z<word1odds.length;z++) {
		        				if(word1odds[z]!=word2odds[z]) {
		        					oddequal=false;
		        					break;
		        				}
		        			}
	        			}
	        			if(oddequal&&evensequal) used[j]=1;
	        		}
        		}
        	}
        }
        return counter;
    }
    
}
