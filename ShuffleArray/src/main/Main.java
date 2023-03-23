package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
		1470
	 * difficulty - easy
	 * description:
	 *	Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
	 Return the array in the form [x1,y1,x2,y2,...,xn,yn].
	 * constraints:
	 * 1 <= n <= 500
		nums.length == 2n 		always even # of elements
		1 <= nums[i] <= 10^3
	 */
	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();
		int[] nums = new int[]{2,5,1,3,4,7};
		sol.shuffle(nums,3);
		nums = new int[]{1,2,3,4,4,3,2,1};
		sol.shuffle(nums,4);
		nums = new int[]{1,1,2,2};
		sol.shuffle(nums,2);
	}

}
