package classes;

/**
 * this is not my code
 * I knew a counting sort would be useful for this one, but wasnt sure how to do it
 * this guy puts the numbers into a counting sort, then
 * iterates through the sort, incrementing each index to be its value plus the value below it, so a running sum
 * then the answer for each item in the original array is the value at its spot in the sort array
 */
public class BestSolution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numsCount = new int[101];
        for(int n : nums)numsCount[n]++;
        for(int i =1; i<numsCount.length;i++){
            numsCount[i] = numsCount[i] + numsCount[i-1];
        }
        for(int i =0; i<nums.length;i++){
            if(nums[i]==0)continue;
            nums[i] = numsCount[nums[i]-1];
        }
        return nums;
    }
}
