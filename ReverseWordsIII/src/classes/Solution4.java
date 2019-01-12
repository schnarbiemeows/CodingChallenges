package classes;

/*
 * ok, this is my recreation of the online solution, beat 97.01%
 */
public class Solution4 {

	 public String reverseWords(String s) {
	     if(s==null||s.isEmpty()) return s;
	     char[] characters = s.toCharArray();
	     int left = 0;
	     int right = s.indexOf(" ",left);
	     while(right>-1) {
	    	 int wordstart = left;
	    	 int wordend = right-1;
	    	 swap(wordstart,wordend,characters);
	    	 left=right+1;
	    	 right = s.indexOf(" ",left);
	     }
	     swap(left,s.length()-1,characters);
	     return String.copyValueOf(characters);
	 }
	 
	 private void swap(int start, int end, char[] input) {
		 while(start<end) {
			 char temp = input[start];
			 input[start] = input[end];
			 input[end]= temp;
			 start++;
			 end--;
		 }
	 }
}
