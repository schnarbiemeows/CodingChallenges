package classes;

/**
 * 6:14
 * speed = 100%!
 * memory = 77.59%
 */
public class Solution2 {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;    // original length of the array
        for(int i=0;i<k;i++) {
            if(nums[i] == val) {
                k--;
                while(k>i&&nums[k]==val) {k--;}
                if(k>i) {
                    nums[i]=nums[k];
                }
            }
        }
        return k;
    }
}
