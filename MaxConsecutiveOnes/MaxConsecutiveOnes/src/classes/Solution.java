package classes;

/*
 * 11:02 - 11:45
 * speed = 98.89%!
 * memory = 13.84%
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 * two pointers, one keeps track of the current string of ones
 * the second keeps track of the new string of ones
 * find each single zero and the lengths of ones on each side
 * 1,1,0,0,1,1,0,1,0,1,1,1,1,0
 * if(zeroCount = 0) {
 *  if(currentNum = 1) {
 *
 * } else {
 *
 * }
 * every time you find a zero, the length = { # of ones on its left} + 1 + { # of ones on its right }
 * so, if there is a zero on either side of that zero, then its just 0 for that value
 *
 */
public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        if(nums.length==1) {
            return 1;
        }
        int onesOnLeft = 0;
        int onesOnRight = 0;
        boolean foundAzero = false;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i]==0) {
                foundAzero = true;
                onesOnRight = 0;
                int j = i+1;
                while(j<nums.length&&nums[j]==1) {
                    onesOnRight++;
                    j++;
                }
                maxOnes = Math.max(maxOnes,(onesOnLeft+1+onesOnRight));
                onesOnLeft=0;
            } else {
                onesOnLeft++;
            }
        }
        if(foundAzero) {
            return maxOnes;
        } else {
            return onesOnLeft;
        }
    }
}
