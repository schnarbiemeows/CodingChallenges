package classes;

/*
 * cool, first submission, no errors, beat 94.37%
 */
public class Solution {

		public int findComplement(int num) {
		int bits = 0;
		int item = num;
		while(item>1) {
			bits++;
			item=item>>1;
		}
		bits++;
		return (1<<bits)-1-num;
    }
}

/*
 * 
 * 
 * this is a one-line solution online, doesn't say how efficient it was
 * public int findComplement(int num) {
        return ~num & (-1 >>> Integer.numberOfLeadingZeros(num));
    }
 */