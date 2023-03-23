package classes;

/**
 * I don't understand how this is not just adding up the total # of 1's in the string
 * ohhhhhhhhhhh, OK
 * so, if you have {1,1,1,1} = 1 subarray of length 4, 2 subarrays of length 3, 3 subarrays of length 2, 4 subarrays of length 1
 * = (n)*(n+1)/2, which is what MY Solution2 is doing.
 * But this solution actually is doing it the way above, which is basically simpler
 */
public class BestSolution {
    public int numSub(String s) {
        int temp = 0;
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                temp++;
                sum = (int)((sum + temp) % (1e9 + 7));
                System.out.println("temp = " + temp + " , sum = " + sum);
            } else {

                temp = 0;
            }
        }
        return sum;
    }
}
