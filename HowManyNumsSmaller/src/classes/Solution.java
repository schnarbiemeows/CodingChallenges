package classes;

/*
 * start time = 11:23
 * end time = 12:05, but was also doing work stuff
 * total time =  minutes
 * speed =  70.78%%
 * memory =  18.25%
 * notes:
 *
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            int total = 0;
            for(int j=i-1;j>=0;j--) {
                if(nums[j]<nums[i]) total++;
            }
            for(int j=i+1;j<nums.length;j++) {
                if(nums[j]<nums[i]) total++;
            }
            answer[i]=total;
        }
        return answer;
    }
}
