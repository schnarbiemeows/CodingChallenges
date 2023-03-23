package classes;

import java.util.HashMap;
import java.util.Map;

/*
 * start time = 5:30
 * end time = 5:56
 * total time = 26 minutes
 * speed = 26.5 %
 * memory = 58.20 %
 * notes:
 * rats, 2 wrong answers, and poor performance
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> charMap = new HashMap();
        Map<Character,Character> charMap2 = new HashMap();
        for(int i=0;i<s.length();i++) {
            if(!charMap.containsKey(s.charAt(i))) {
                if(charMap2.containsKey(t.charAt(i))) return false;     // someone already mapped another key to the same letter
                charMap.put(s.charAt(i),t.charAt(i));
                charMap2.put(t.charAt(i),s.charAt(i));
            } else {
                if(charMap.get(s.charAt(i))!=t.charAt(i)) return false;
            }
        }
        return true;
    }
}
