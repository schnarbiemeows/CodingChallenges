package classes;

/*
 * 521
 * very easy after thinking about it for a minute, perfect submission
 * beat 97.83%
 * memory beats 100%
 */
public class Solution {

	public int findLUSlength(String a, String b) {
        if(a==null&&b==null) return -1;
        if(a==null) return b.length();
        if(b==null) return a.length();
        if(a.equals(b)) return -1;
        if(a.length()==b.length()) return b.length();
        return a.length()>b.length() ? a.length() : b.length();
    }
}
