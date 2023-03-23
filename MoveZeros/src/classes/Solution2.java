package classes;

/**
 * 5:39 - 5:45
 * speed = 56.52%
 * memory = 43%
 */
public class Solution2 {

    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0; i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for(int j = index;j<nums.length;j++) {
            nums[j] = 0;
        }
        System.out.println("DONE!");
    }
}
