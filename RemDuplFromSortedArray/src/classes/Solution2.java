package classes;

/*
8:38 - 9:52! fucking 74 minutes!
why did I overanalyze this problem so much, the answer is quite simple
this solution works
 */
public class Solution2 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int indexOn = 1;
        int counter = 0;
        while(counter<nums.length&&indexOn< nums.length) {
            if(nums[indexOn]==nums[indexOn-1]) {
                for(int i=indexOn;i<nums.length;i++) {
                    nums[i-1]=nums[i];
                }
            } else {
                indexOn++;
            }
            counter++;
        }
        return indexOn;
    }
}
