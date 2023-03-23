package classes;

/**
 *
 * we need to use modulo
 * ( a + b) % c = ( ( a % c ) + ( b % c ) ) % c
 * ( a * b) % c = ( ( a % c ) * ( b % c ) ) % c
 * https://www.geeksforgeeks.org/modulo-1097-1000000007/
 */
public class Solution2 {
    public int numSub(String s) {
        String[] ones = s.split("0");
        long total = 0;
        int M = 1000000007;
        for(int i=0;i<ones.length;i++) {
            if(ones[i].length()>0) {
                System.out.println("length of string of ones = " + ones[i].length()); // if the string of ones > ~ 46000(80,000 in this case) we need to modulo every intermediate step
                long lengthmod1 = ones[i].length()%M;
                long lengthmod2 = (ones[i].length()%M+1)%M;  // we know that 1%M = 1
                long subtotal = ((lengthmod1*lengthmod2)%M)/2;
                total = (total%M + subtotal%M)%M;
            }
        }
        System.out.println("total = " + total);
        return (int)total;
    }
}
