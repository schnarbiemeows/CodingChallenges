package classes;

/**
 * this is listed as a medium!
 * 11:03 - 11:21 = only 18 minutes
 * WAY better solution!
 * beat 75% of online submission
 * beat 67.85% for memory usage
 */
public class Solution2 {
    public int reverse(int x) {
        int reverse = 0;
        int nextReverse = 0;
        boolean neg = x<0 ? true : false;
        x = Math.abs(x);
        while(x>0) {
            reverse = reverse*10 + x%10;
            x = x/10;
            if(reverse/10!=nextReverse) return 0;   // if the 32 bits are exceeded after *10, then the new value will be less than what it was before
            nextReverse=reverse;    // save the last value
        }
        if(neg) {
            return 0-reverse;
        } else {
            return reverse;
        }

    }
}
