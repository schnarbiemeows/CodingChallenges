package classes;

/*
 * start time = 6:03
 * end time = 6:19
 * total time = 16 minutes
 * speed = 100 %
 * memory = 92.2 %
 * notes:
 * ok
 */
public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        char[] chars2 = new char[s.length()];
        for(int i=0;i< indices.length;i++) {
            chars2[indices[i]]=chars[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<chars.length;i++) {
            sb.append(chars2[i]);
        }
        return sb.toString();
    }
}
