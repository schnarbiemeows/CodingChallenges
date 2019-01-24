package classes;

import java.util.Arrays;

/*
 * 575
 * easy to figure out, but only beat 62.63% of submissions
 */
public class Solution {

	public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int lastNum = candies[0];
        int numDiffNums = 1;
        for(int i=1;i<candies.length;i++) {
        	if(candies[i]!=lastNum) {
        		numDiffNums++;
        		lastNum=candies[i];
        	}
        }
        if(numDiffNums>candies.length/2) return candies.length/2;
        return numDiffNums;
    }
}
