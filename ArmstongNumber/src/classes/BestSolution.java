package classes;

/**
 * this is not my code
 * beat 100%/100%
 */
public class BestSolution {
    public boolean isArmstrong(int N) {
        //number of digits in N
        int k = (int) (Math.log10(N) + 1);
        //temporary variable (so we dont modify N)
        int x = N;
        //to hold sum
        int sum = 0;
        //get each digit
        while (x != 0) {
            //add this digit^k to sum
            sum += Math.pow(x % 10, k);
            //get next digit
            x /= 10;
        }
        return sum == N;
    }
}
