package classes;

import java.util.stream.IntStream;

public class Solution {

	/*
	 * this answer worked, but only beat 42.63% of submissions
	 */
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) return false;
		int[] letterCounts = new int[26];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int val = c-97;
			letterCounts[val]++;
		}
		for(int j=0;j<t.length();j++) {
			char d = t.charAt(j);
			if(letterCounts[d-97]>0) {
				letterCounts[d-97]--;
			} else return false;
		}
		for(int k=0;k<25;k++) {
			if(letterCounts[k]>0) return false;
		}
		return true;
    }
}
/*
 * this answer gave a timeout exception, because they are using maximum length strings

while(t.length()>0) {
if(!s.contains(t.substring(0, 1)))
	return false;
s=s.replaceFirst(t.substring(0, 1), "");
t=t.replaceFirst(t.substring(0, 1), "");
}
if(s.length()==0&&t.length()==0) return true;
return false;
*/