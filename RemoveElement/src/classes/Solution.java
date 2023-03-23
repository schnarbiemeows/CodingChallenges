package classes;

import java.util.Arrays;

/*
 * 8:24 - 8:33 = 9 min.
 * time = only beats 5.70%(because I sorted)
 * memory = beats 43.18%
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int count = 0;
        int index = -1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==val) {
                count++;
                if(index==-1) {
                    index = i;
                }
            }
        }
        int answer = nums.length-count;
        if(index>=0) {
            for(int j=index;j<nums.length;j++) {
                if((j+count)<nums.length) {
                    nums[j]=nums[j+count];
                }
            }
        }
        return answer;
    }
}
