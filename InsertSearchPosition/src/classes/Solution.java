package classes;

/*
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
 * Memory Usage: 39.9 MB, less than 5.03% of Java online submissions for Search Insert Position.
 * not sure why its only 5%
 */
public class Solution {
	public int searchInsert(int[] nums, int target) {
        int counter = 0;
        while(counter<nums.length&&nums[counter]<target) counter++;
        return counter;
    } 
}
