package classes;

import java.util.HashMap;
import java.util.Map;

/**
 * Runtime: 25 ms, faster than 33.22% of Java online submissions for Ransom Note.
 * Memory Usage: 49.4 MB, less than 37.06% of Java online submissions for Ransom Note.
 */
public class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) return false;
        for(char c: ransomNote.toCharArray()) {
            if(!magazine.contains(c+"")) {
                return false;
            }
        }
        Map<Character, Integer> magazineMap = new HashMap();
        for(char c : magazine.toCharArray()) {
            if(magazineMap.containsKey(c)) {
                magazineMap.put(c,magazineMap.get(c)+1);
            } else {
                magazineMap.put(c, 1);
            }
        }
        for(char c: ransomNote.toCharArray()) {
            if(!magazineMap.containsKey(c)||magazineMap.get(c)<1) {
                return false;
            } else {
                magazineMap.put(c,magazineMap.get(c)-1);
            }
        }
        return true;
    }
}
