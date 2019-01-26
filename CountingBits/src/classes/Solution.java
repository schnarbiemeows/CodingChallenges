package classes;

/*
 * 338
 * Oh wow, first submission, no errors, beat 99.94%
 */
public class Solution {

	public int[] countBits(int num) {
        int[] bits = new int[num+1];
        for(int i=0;i<bits.length;i++) {
        	bits[i]=Integer.bitCount(i);
        }
        return bits;
    }
}
