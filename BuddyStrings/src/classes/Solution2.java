package classes;

import java.util.HashSet;
import java.util.Set;

/**
 * the idea here is that,
 * 1. if we compare the letters at the same index in each array, there should eitthher be:
 * - no difference: - if the strings are > 26 characters, guarantee there will be at least 1 double,
 *      otherwise, we would need to check for one letter that occurs more than once(Set)
 *  - 2 chars differ:
 */
public class Solution2 {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.length()==1) return false;
        if(s.equals(goal)) {
            if(s.length()>26) {
                return true;
            } else {
                Set<String> charSet = new HashSet();
                for(int i=0;i<s.length();i++) {
                    charSet.add(""+s.charAt(i));
                }
                if(charSet.size()<s.length()) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        int[] diffIndex = new int[2];
        char[] orig = s.toCharArray();
        char[] repl = goal.toCharArray();
        int numdiffs = 0;
        for(int i=0;i<orig.length;i++) {
            if(orig[i]!=repl[i]) {
                if(numdiffs>1) {
                    return false;
                } else {
                    diffIndex[numdiffs++] = i;
                }
            }
        }
        if(numdiffs==2) {
            if(orig[diffIndex[0]]==repl[diffIndex[1]]&&orig[diffIndex[1]]==repl[diffIndex[0]]) return true;
        }
        return false;
    }
}
