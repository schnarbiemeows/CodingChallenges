package classes;

/*
 * 2 submission, had an error on first submission bc line 12 had last = 0 instead of -1
 * and line 17 had if(last>0) instead of >-1
 * but second submission beat 97.67% 
 */
public class Solution {

	public int[] shortestToChar(String S, char C) {
		if(S.length()==1) return new int[1];
        int[] answer = new int[S.length()];
        char[] letters = S.toCharArray();
        int last = -1;
        int next = S.indexOf(C,last);
        int index = 0;
        while(next!=-1) {
        	if(last>-1) {
        		answer[index]=Math.min(index-last,next-index);
        	} else {
        		answer[index]=next-index;
        	}
        	if(letters[index]==C) {
        		last = index;
        		next = S.indexOf(C,last+1);
        	}
        	index++;
        }
        while(index<S.length()) {
        	answer[index]=index-last;
        	index++;
        }
        return answer;
    }
}
