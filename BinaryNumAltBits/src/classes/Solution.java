package classes;

/*
 * 693
 * first submission wrong, because it thinks that "1" is true
 * second submission only beat 21.14%
 */
public class Solution {

	public boolean hasAlternatingBits(int n) {
		if(n==1) return true;
        int init = n%2;
        n=n/2;
        while(n>0) {
        	if(n%2==init) return false;
        	init=n%2;
        	n=n/2;
        }
        return true;
    }
}
