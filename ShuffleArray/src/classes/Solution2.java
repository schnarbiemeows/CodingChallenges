package classes;

/**
 * this doesn't work, but nobody else did an in-place solution, even thoe ones that beat 100%/100%
 */
public class Solution2 {
    public int[] shuffle(int[] nums, int n) {
        int temp = nums[0];
        int index = 0;
        for(int i=0;i<nums.length/2;i+=2) {
            nums[index] = temp;
            temp = nums[index+1];
            nums[index+1] = nums[i+n];
            index+=2;
        }
        return nums;
    }
}
