package classes;

import java.util.HashMap;
import java.util.Map;

/*
 * 1 - make ransomNote a character array
 * 2. hashmap the counts of all of the letters in magazine
 * 3. for each item in the array, if the character aint there return false
 *  else if it is, decrement
 * Runtime: 34 ms, faster than 22.05% of Java online submissions for Ransom Note.
Memory Usage: 53 MB, less than 14.23% of Java online submissions for Ransom Note.
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
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
