package classes;

public class Solution {

	/* 
	 * wow! ok, this submission beat 95.62% of all submissions!
	 */
	public boolean isPalindrome(String s) {
		if(s.isEmpty()) return true;
		char[] s2 = s.toCharArray();
		int beginIndex = 0,endingIndex = s2.length-1;
		for(int i=0;i<s2.length;i++) {
			if(97<=s2[i]&&s2[i]<=122) s2[i]-=32; 
		}
		while(beginIndex<endingIndex) {
			while(beginIndex<s2.length-1&&(s2[beginIndex]<48||57<s2[beginIndex]&&s2[beginIndex]<65||90<s2[beginIndex])) beginIndex++; 
			while(endingIndex>0&&(s2[endingIndex]<48||57<s2[endingIndex]&&s2[endingIndex]<65||90<s2[endingIndex])) endingIndex--;
			if(beginIndex<endingIndex) {
				if(Math.abs(s2[endingIndex]-s2[beginIndex])!=0) return false;
				beginIndex++;
				endingIndex--;
			}
		}
		return true;
    }
}

/*
 * 48 - 57, 65 - 90, 97 - 122
 * first submission, no errors, but only beats 10.58% of submissions
 * 
if(s.isEmpty()) return true;
char[] s2 = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();
int beginIndex = 0,endingIndex = s2.length-1;
while(beginIndex<endingIndex) {
	if(s2[beginIndex]!=s2[endingIndex-beginIndex]) return false;
	beginIndex++;
}
return true;*/