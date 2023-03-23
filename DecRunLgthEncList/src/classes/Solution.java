package classes;

/*
 * start time = 10:20
 * end time = 10:38
 * total time =  minutes
 * speed = 78.49 %
 * memory = 81.43 %
 * notes:
 * 1. go add upp the odd indexes to get the size of the final array
 *
 */
public class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arraysize = 0;
        for(int i=0;i<nums.length;i+=2) {
            arraysize+=nums[i];
        }
        int[] answer = new int[arraysize];
        int offset = 0;
        for(int i=0;i<nums.length-1;i+=2) {
            for(int j=0;j<nums[i];j++) {
                answer[j+offset] = nums[i+1];
            }
            offset+=nums[i];
        }
        return answer;
    }
}
