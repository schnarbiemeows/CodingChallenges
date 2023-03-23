package classes;

/*
 * start time = 7:00
 * end time = 7:14
 * total time = 14 minutes
 * speed = 100 %
 * memory = 98.89 %
 * notes:
 *
 */
public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            int indexy = index[i];
            insert(target,nums[i],indexy);
        }
        return target;
    }
    private void insert(int[] target, int val, int index) {
        for(int i = target.length-1;i>=index+1;i--) {
            target[i]=target[i-1];
        }
        target[index]=val;
    }
}
