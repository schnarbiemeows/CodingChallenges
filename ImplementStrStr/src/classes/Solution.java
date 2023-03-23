package classes;

import java.util.HashMap;
import java.util.Map;

/*
 * 3:50 - 4:12 = 22 minutes
 * speed = 9.85%
 * memory = 70.16%
 * why is this so slow?
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) {
            return -1;
        }
        char s = needle.charAt(0);
        int length = needle.length();
        char[] chars = haystack.toCharArray();
        for(int i=0;i<chars.length;i++) {
            if(chars[i]==s&&i+length<=chars.length) {
                boolean found = true;
                for(int j = i+1;j<i+length;j++) {
                    if(chars[j]-needle.charAt(j-i)!=0) {
                        found=false;
                    }
                }
                if(found) {
                    return i;
                }
            }
        }
        return -1;
    }
}
