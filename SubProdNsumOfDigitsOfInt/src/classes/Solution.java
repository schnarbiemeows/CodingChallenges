package classes;

/*
 * start time = 11:14
 * end time = 11:20
 * total time = 6 minutes
 * speed =  100%
 * memory =  43.77%
 * notes:
 *
 */
public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            sum+=n%10;
            product*=n%10;
            n=n/10;
        }
        return product-sum;
    }
}
