package classes;

public class Solution {

	/* 
	 * this one beats 100% of all submissions, why?
	 */
	public String toLowerCase(String str) {
        String returnStr = "";
        for(int i=0;i<str.length();i++) {
        	char c = (char)str.charAt(i);
        	if(c<91&&c>64) {
        		c+=32;
        	}
        	returnStr+=c;
        }
        return returnStr;
    }
}
