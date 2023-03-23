package classes;

/*
 * start time = 6:13
 * end time = 6:55
 * total time = 42 minutes
 * speed = 81.73 %
 * memory = 34.26 %
 * notes:
 * this solution did not work, it was brute force and exceeded time
 * Solution 2 worked, and that is what the numbeers above are for
 */
public class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.length()==1) return false;
        char[] orig = s.toCharArray();
        char[] repl = goal.toCharArray();
        for(int i=0;i<orig.length-1;i++) {
            for(int j=i+1;j<orig.length;j++) {
                char temp = orig[i];
                orig[i]=orig[j];
                orig[j]=temp;
                if(compare(orig,repl)) return true;
                orig=s.toCharArray();
            }
        }
        return false;
    }
    private boolean compare(char[] orig, char[] replacement) {
        for(int i=0;i<orig.length;i++) {
            if(orig[i]!=replacement[i]) return false;
        }
        return true;
    }
}
