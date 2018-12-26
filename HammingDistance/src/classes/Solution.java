package classes;

public class Solution {

	/*
	 * 1st submission, no errors, beat 59.63% of submissions
	 */
	public int hammingDistance(int x, int y) {
		int z = x^y;
		int count = 0;
		while(z>0) {
			count+=z%2;
			z=z/2;
		}
        /*String zstr = Integer.toBinaryString(z);
        int count = 0;
        for(int i=0;i<zstr.length();i++) {
        	count +=zstr.charAt(i)-48;
        }*/
        return count;
    }
}
