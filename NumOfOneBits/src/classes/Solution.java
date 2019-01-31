package classes;

/*
 * 191
 * first submission, beat 79.58%
 */
public class Solution {

	public int hammingWeight(int n) {
        if(n==0||n==1) return n;
        int count=0;
        while(n!=0) {
        	if(n%2==1||n%2==-1) count++;
        	n=n>>>1;
        }
        return count;
    }
}
