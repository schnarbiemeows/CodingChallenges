package classes;

/*
 * start time = 5:14
 * end time = ????
 * total time = ???? minutes
 * speed = 32.53 %
 * memory = 83.90 %
 * notes:
 * these stats above are for Solution2.
 * I learned how/why to use modulo
 */
public class Solution {
    public int numSub(String s) {
        long total = 0l;
        char[] chars = s.toCharArray();
        int i=0;
        int j=-1;
        long M = 1000000007;
        while(i<chars.length&&j<chars.length) {
           while(i<chars.length&&chars[i]!='0') i++;
           total+=((i-1-j)*(i-j)/2)%M;
           j=i;
           i++;
        }
        System.out.println("total = " + total%M);
        int modulustotal = (int)(total%M);
        return modulustotal;
    }
}
