package main;

import java.util.Arrays;

public class InstructorsSolution {

	
	/* Instructor's O(nlogn) solution */
	 public int maximumProduct(int[] nums) {
		// sort in ascending order
		Arrays.sort(nums);
		// calculate p1 and p2
		int n = nums.length;
		int p1 = nums[n-1]*nums[n-2]*nums[n-3];
		int p2 = nums[0]*nums[1]*nums[n-1];
		// return the max of p1 and p2
		return Math.max(p1,p2);
	}
	
	/*public int maximumProduct(int[] nums) {
		Instructor's O(N) solution is basically the exact same as mine, except
		that I didn't need to check for a negative value for the mins
		I didn't look at his solution until I had already submitted mine 
	}*/
}
