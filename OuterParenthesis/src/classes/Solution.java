package classes;

/*
 * 1st submission, no errors
 * Runtime: 6 ms, faster than 46.83% of Java online submissions for Remove Outermost Parentheses.
 * Memory Usage: 38.2 MB, less than 100.00% of Java online submissions for Remove Outermost Parentheses.
 */
public class Solution {

	public String removeOuterParentheses(String S) {
		if(S==null||S.length()==0) return S;
        char[] letters = S.toCharArray();
        String output = "";
        int start=0, end=0,total=0;
        for(int i=0;i<S.length();i++) {
        	if(letters[i]=='(') {
        		total++;
        	}
        	else if(letters[i]==')') {
        		total--;
        		if(total==0) {
	        		if(i-start>1) {
	        			char[] word = new char[i-start-1];
	        			for(int j=start+1;j<i;j++) {
	        				word[j-start-1] = letters[j];
	        			}
	        			output+=String.valueOf(word);
        			}
        			start=i+1;
        		} 
        	}
        }
        return output;
    }
}
