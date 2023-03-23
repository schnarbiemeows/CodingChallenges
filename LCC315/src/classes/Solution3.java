package classes;

/** brute force here
 * just for every # up to num calcuate its reverse, add them together and if they add num return true else false
 * what is the pattern here?
 *
 */
public class Solution3 {

    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        for(int i=0;i<num;i++) {
            if(i+reverse(i)==num) return true;
        }
        return false;
    }

    private int reverse(int num) {
        int temp = num;
        int ans = 0;
        while(temp>0) {
            ans = ans*10+temp%10;
            temp = temp/10;
        }
        return ans;
    }
}
