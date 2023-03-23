package classes;

/**
 * 4:55 - 4:57 = 2 minutes
 * speed = 41.91%
 * memory = 71.9%
 * hmm, ok, i found a solution exactly the same as mine that beat 99.9%, so I think maybe just so many
 * people have done this one, and its so simple, that all the answers are really close
 */
public class Solution2 {
    public void reverseString(char[] s) {
        if(s.length==1) return;
        int j = s.length-1;
        int i = 0;
        while(i<j) {
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
