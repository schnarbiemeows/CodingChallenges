package classes;

/*
 * 8:38 - 9:52! fucking 74 minutes!
 * this solution doesn't work, Solution2 works
 * start at index 1,
 * you have the current index that you are on
 * you have the next index to copy to
 * if the current index that you are on is different than the index to copy to then
 *  - if you are working on a duplicate than:
 *       increment the index that you are on until you find a non-duplicate, then
 *
 *  - else copy from-to and increment both indexes
 * when you find a duplicate for the first time:
 * - go to each of the next elements until you find a non-duplicate
 *
 * do this until the index that you are on is == length of array
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        boolean duplicateMode = false;
        int comparator = nums[0];
        int indexWeAreOn = 1;
        int indexToCopyTo = 0;
        int finalLength = nums.length;
        while(indexWeAreOn<nums.length) {
            if(duplicateMode) {
                // the current element is a duplicate, so we will decrease the final array length by 1
                finalLength--;
                // while we are looking for the first non-duplicate
                if(nums[indexWeAreOn]==comparator) {
                    //indexWeAreOn++;
                }
                // once we have found the first non-duplicate
                else {
                    duplicateMode=false;
                    nums[indexToCopyTo]=nums[indexWeAreOn];
                    indexToCopyTo++;
                    comparator=nums[indexWeAreOn];
                }
                // regardless of if we are copying or not, increment where we are
                indexWeAreOn++;
            } else {
                // we are looking for a duplicate
                if(nums[indexWeAreOn]==comparator) {
                    // switch to duplicate mode
                    duplicateMode = true;
                    indexToCopyTo = indexWeAreOn;
                } else {
                    comparator = nums[indexWeAreOn];
                    indexToCopyTo++;
                    indexWeAreOn++;
                }
            }

        }
        return finalLength;
    }
}
