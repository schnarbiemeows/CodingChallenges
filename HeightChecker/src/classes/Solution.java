package classes;

import java.util.Arrays;

/*
 * 10:25 - 10:33
 * 1 <= heights.length <= 100
1 <= heights[i] <= 100
* speed = 5.62%
* memory = 44.92%
 */
public class Solution {

    public int heightChecker(int[] heights) {
        if(heights.length==1) return 0;
        int[] sorted = new int[heights.length];
        for(int i=0;i<heights.length;i++) {
            sorted[i] = heights[i];
        }
        Arrays.sort(sorted);
        int diff = 0;
        for(int i=0;i<heights.length;i++) {
            if(sorted[i]!=heights[i]) {
                diff++;
            }
        }
        return diff;
    }
}
