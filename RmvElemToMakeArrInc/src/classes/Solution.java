package classes;

/*
 * start time = 11:04
 * end time = ehh, was working, and cooking, and went to store, etcc
 * total time =  minutes
 * speed = 12.5 %
 * memory = 74.77 %
 * notes:
 *
 */
public class Solution {
    public boolean canBeIncreasing(int[] nums) {
        if(nums.length==2) return true;
        boolean alreadyIncreasing = true;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<=nums[i-1]) alreadyIncreasing = false;
        }
        if(alreadyIncreasing) return true;
        for(int i=0;i<nums.length;i++) {
            alreadyIncreasing = compare(i,nums);
            if(alreadyIncreasing) return true;
        }
        return alreadyIncreasing;
    }

    private boolean compare(int index, int[] nums) {
        int tempNum = nums[index];
        nums[index]=-1;
        for(int j=1;j<nums.length;j++) {
            if(nums[j]==-1||index==0&&nums[j-1]==-1) {
                continue;
            }
            if(nums[j-1]==-1) {
                if(nums[j]-nums[j-2]<1) {
                    nums[index]=tempNum;
                    return false;
                }
            } else if(nums[j]-nums[j-1]<1) {
                nums[index]=tempNum;
                return false;
            }
        }
        nums[index]=tempNum;
        return true;
    }
}
