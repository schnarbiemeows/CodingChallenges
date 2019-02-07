package classes;

/*
 * 693
 * ha! this one beat 100% so bit shifting is faster!
 */
public class Solution2 {

	public boolean hasAlternatingBits(int n) {
		if(n==1) return true;
        int init = n%2;
        n=n>>>1;
        while(n>0) {
        	if(n%2==init) return false;
        	init=n%2;
        	n=n>>>1;
        }
        return true;
    }
}
