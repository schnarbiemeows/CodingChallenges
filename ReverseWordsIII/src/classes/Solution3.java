package classes;

/*
 * arg, even worse!, only beat 11.96%online example, just wanna see the results
 * why is this better?
 */
public class Solution3 {

	 public String reverseWords(String s) {
	        if (s.length() == 0) {
	            return s;
	        }
	        int left = 0;
	        char[] str = s.toCharArray();
	        while (s.indexOf(' ', left) != -1) {
	            int right = s.indexOf(' ', left + 1);
	            reverse(left, right - 1, str);
	            left = right + 1;
	        }
	        reverse(left, s.length() - 1, str);
	        return new String(str);
	    }
	    void reverse(int left, int right, char[] s) {
	        while (left < right) {
	            char tmp = s[left];
	            s[left] = s[right];
	            s[right] = tmp;
	            ++ left;
	            -- right;
	        }
	    }
}
