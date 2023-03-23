package classes;

import java.util.Arrays;

/**
 * taking my Solution, and BestSolution, to see what my SOlution would get with Arrays.fill()
 * speed = 97.80%
 * memory = 72.94%
 * so, yea, faster, but less memory efficient
 */
public class Solution2 {
    public int[] decompressRLElist(int[] nums) {
        int arraysize = 0;
        for(int i=0;i<nums.length;i+=2) {
            arraysize+=nums[i];
        }
        int[] answer = new int[arraysize];
        int offset = 0;
        for(int i=0;i<nums.length-1;i+=2) {
            Arrays.fill(answer, offset, offset + nums[i], nums[i + 1]);
            offset+=nums[i];
        }
        return answer;
    }
}
