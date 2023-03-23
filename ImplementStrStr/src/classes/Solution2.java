package classes;

/**
 * pfft did this one in 2 minutes!
 * speed = 100%!
 * memory = 95.84%!
 * I guess sometimes converting to character array is NOT faster than the built in methods
 */
public class Solution2 {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if(!haystack.contains(needle)) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
