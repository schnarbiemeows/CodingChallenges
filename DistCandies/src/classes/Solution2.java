package classes;

import java.util.HashSet;
import java.util.Set;

/*
 * 575
 * Ok, this is better, beat 89.37% of submissions
 */
public class Solution2 {

	public int distributeCandies(int[] candies) {
        Set<Integer> uniqueNums = new HashSet<Integer>();
        for(int i=0;i<candies.length;i++) {
        	uniqueNums.add(candies[i]);
        }
        if(uniqueNums.size()>candies.length/2) return candies.length/2;
        return uniqueNums.size();
    }
}
