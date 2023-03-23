package classes;

/**
 * Runtime: 92 ms, faster than 5.43% of Java online submissions for Ransom Note.
 * Memory Usage: 118.3 MB, less than 5.01% of Java online submissions for Ransom Note.
 * so, not good, actually
 */
public class Solution3 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) return false;
        for(char c: ransomNote.toCharArray()) {
            if(!magazine.contains(c+"")) {
                return false;
            } else {
                magazine = magazine.replaceFirst(c+"","");
            }
        }
        return true;
    }
}
