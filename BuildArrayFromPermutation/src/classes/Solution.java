package classes;

/*
 * start time = 7:06
 * end time = 7:12
 * total time =  6 minutes
 * speed =  100%
 * memory =  11.73%
 * notes:
 * basically, take each number in the array, use that value as an index, and then go get the value at THAT index
 */
public class Solution {
    public int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            answer[i] = nums[nums[i]];
        }
        return answer;
    }
}
