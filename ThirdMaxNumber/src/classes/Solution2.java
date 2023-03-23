package classes;

/**
 * way faster
 * speed = 88.98%
 * memory = 65.65%
 */
public class Solution2 {
    public int thirdMax(int[] nums) {
        int max1 = -2147483648;
        int max2 = -2147483648;
        int max3 = -2147483648;
        boolean secMax = false;
        boolean thridMax = false;
        for(int i = 0 ; i<nums.length; i++) {
            max1 = Math.max(max1,nums[i]) ;
        }
        for(int i = 0 ; i<nums.length; i++) {
            if(nums[i]!=max1) {
                secMax=true;
                max2 = Math.max(max2,nums[i]) ;
            }
        }
        if(secMax) {
            for(int i = 0 ; i<nums.length; i++) {
                if(nums[i]!=max1&&nums[i]!=max2) {
                    thridMax = true;
                    max3 = Math.max(max3,nums[i]) ;
                }
            }
        }
        if(thridMax) return max3; else return max1;
    }
}
