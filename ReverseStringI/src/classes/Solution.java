package classes;

/*
 * pow! first submission, no errors, beat 99.53%!
 */
public class Solution {

	public String reverseString(String s) {
    	char[] letters = s.toCharArray();
    	int start = 0;
    	int end = letters.length-1;
    	while(start<end) {
    		char temp = letters[start];
    		letters[start]=letters[end];
    		letters[end]=temp;
    		start++;
    		end--;
    	}  
    	return String.copyValueOf(letters);  
    }
}
