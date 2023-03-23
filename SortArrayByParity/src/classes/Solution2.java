package classes;

/**
 * 5:51 - 6:03
 * speed = 5%
 * memory = 21.4%
 * every # is either even or odd
 * there could be more of one type than another
 * if you find an odd #, swith it with the first even that you find
 * if you don't find any more evens, then you are done, and that last odd doesnt need to be moved
 * if you do find an even, switch the two
 */
public class Solution2 {
    public int[] sortArrayByParity(int[] nums) {
        int temp = 0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i]%2==1) {
                int j = i+1;
                boolean found = false;
                while(!found&&j<nums.length) {
                    if(nums[j]%2==0) {
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        found=true;
                    }
                    j++;
                }
                if(!found) return nums;
            }
        }
        return nums;
    }
}
