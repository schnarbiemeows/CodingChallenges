package classes;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/*
 * 917
 * I submitted solution 2, not this one
 */
public class Solution {

	public String reverseOnlyLetters(String S) {
        if(S==null||S.length()==0||S.length()==1) return S;
        char[] letters = S.toCharArray();
        int start = 0;
        int end = letters.length-1;
        while(start<end) {
        	if( (letters[start]>65&&letters[start]<91||
        		letters[start]>96&&letters[start]<123) &&
        		(letters[end]>65&&letters[end]<91||
        		letters[end]>96&&letters[end]<123) ) {
        			swap(letters,start,end);
        			start++;
        			end--;
        		}
        	else {
        		if( letters[start]<65||letters[start]>90&&letters[start]<97||
        	 		letters[start]>122) start++;
        	 	if( letters[end]<65||letters[end]>90&&letters[end]<97||
        	 		letters[end]>122) end--;
        	 }
        }
        return String.valueOf(letters);
    }
    
    public void swap(char[] input, int start, int end) {
    	char temp = input[start];
    	input[start] = input[end];
    	input[end] = temp;
    }
}
