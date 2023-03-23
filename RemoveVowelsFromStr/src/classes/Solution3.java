package classes;

import java.util.HashMap;
import java.util.Map;

/**
 * better
 * speed = 82.29%
 * memory = 56.35%
 */
public class Solution3 {
    public String removeVowels(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> vowels = new HashMap();
        vowels.put('a',1);
        vowels.put('e',1);
        vowels.put('i',1);
        vowels.put('o',1);
        vowels.put('u',1);
        for(int i=0;i<chars.length;i++) {
            if(!vowels.containsKey(chars[i])) {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
