package classes;

/**
 * 9:35 - 9:43
 * run time = 57.79%, memory = 63.51%
 */
public class Sol2 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int last = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]>nums[last]) {
                last++;
                nums[last]=nums[i];
            }
        }
        return last+1;
    }
}
