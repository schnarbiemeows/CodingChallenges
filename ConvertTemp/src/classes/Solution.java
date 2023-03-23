package classes;

/*
 * start time = 12:22
 * end time = 12:27
 * total time =  minutes
 * speed =  100%
 * memory =  43.2%
 * notes:
 *
 */
public class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15d;
        ans[1] = celsius*1.8d + 32.00d;
        return ans;
    }
}
