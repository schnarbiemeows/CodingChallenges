package classes;

import java.util.Stack;

/*
 * first submission, no errors, only beat 13.03%
 */
public class Solution {

	public String reverseWords(String s) {
		if(s==null) return null;
        Stack<String> words = new Stack<String>();
        String[] items = s.split(" ");
        for(int i=0;i<items.length;i++) {
        	words.push(items[i]);
        }
        String st = "";
        while(!words.isEmpty()) {
        	st +=words.pop()+" ";
        } 
        st = st.substring(0,st.length()-1);
        char[] characters = st.toCharArray();
        for(int j = 0; j<characters.length/2;j++) {
        	char temp = characters[j];
        	characters[j]=characters[characters.length-1-j];
        	characters[characters.length-1-j]=temp;
        }
        st = String.copyValueOf(characters);
        return st;
    }
}
