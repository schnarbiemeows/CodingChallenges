package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * start time = 10:57
 * end time = 11:04
 * total time = 7 minutes
 * speed = 98.78 %
 * memory = 95.21 %
 * notes:
 * 1. go find the max value of all of the kids
 * 2. for each, if i+extraCandies>=max then true
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList(candies.length);
        int max = -1;
        for(int i=0;i<candies.length;i++) {
            max = Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++) {
            if(candies[i]+extraCandies>=max) {
                results.add(true);
            } else {
                results.add(false);
            }
        }
        return results;
    }
}
