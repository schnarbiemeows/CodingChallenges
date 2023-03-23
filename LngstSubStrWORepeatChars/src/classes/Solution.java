package classes;

import java.util.HashSet;
import java.util.Set;

/*
 * start time = 6:12
 * end time = 6:39
 * total time =  27 minutes
 * speed =  13.77%
 * memory =  5.9%
 * notes:
 * poor performance. what I missed was:
 * I did realize that the repeating characters did not meann "in a row" but rather meant when the substring
 * has a character that occurs more than once. So I realized to use the HashSet to track what chars were is each
 * substring.
 * What I did not get right was that, when you find the first repeat character, you can't just clear the Set and the count
 * rather, you have to then search backwards in the array to find the first instance of that character, and readd all
 * characters you find after it into the Set and increment the count likewise
 *
 * how to make more efficient:
 * - make another char[] with length 128 or 256(#32 - #127, and then offset by 32) instead of using Character objects
 * and the HashSet, do this in Solution2
 *
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null|| s.isEmpty()) return 0;
        char[] chars = s.toCharArray();
        int answer = 1;
        int count = 1;
        Set<Character> charSet = new HashSet();
        charSet.add(chars[0]);
        for(int i=1;i<chars.length;i++) {
            if(charSet.contains(chars[i])) {
                answer = Math.max(answer,charSet.size());
                charSet = new HashSet();
                count = redoCount(charSet,chars,i);
            }
            charSet.add(chars[i]);
            count++;
        }
            return Math.max(answer,charSet.size());
    }

    private int redoCount(Set<Character> charSet, char[] chars, int i) {
        int j = i-1;
        int count = 0;
        while(chars[j]!=chars[i]) {
            charSet.add(chars[j]);
            count++;
            j--;
        }
        return count;
    }
}
