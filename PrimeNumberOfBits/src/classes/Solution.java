package classes;

/*
 * 762
 * first submission, no errors, beat 85.39%
 */
public class Solution {
	public int countPrimeSetBits(int L, int R) {
		int primes = 0;
        for(int i=L;i<=R;i++) {
        	int count = Integer.bitCount(i);
        	switch(count) {
				case(2) : primes++;
						  break;
				case(3) : primes++;
						  break;
				case(5) : primes++;
						  break;
				case(7) : primes++;
						  break;
				case(11) : primes++;
						  break;
				case(13) : primes++;
						  break;
				case(17) : primes++;
						  break;
				case(19) : primes++;
						  break;
				default:
			}
        }
        return primes;
    }
}
