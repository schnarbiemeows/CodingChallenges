package classes;

/*
 *	only issue - numlines needs to be initialized to 1, not 0
 *	beat 100% of all submissions! 
 */
public class Solution {

	public int[] numberOfLines(int[] widths, String S) {
        char[] chars = S.toCharArray();
        int numlines = 1;
        int numchars = 0;
        for(int i=0;i<chars.length;i++) {
        	int numSpaces = widths[chars[i]-97];
        	if(numSpaces+numchars>100) {
        		numlines++;
        		numchars = numSpaces;
        	} else {
        		numchars+=numSpaces;
        	}
        }
        int[] answer = new int[2];
        answer[0]=numlines;
        answer[1]=numchars;
        return answer;
    }
}
