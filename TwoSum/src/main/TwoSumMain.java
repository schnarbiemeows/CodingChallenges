package main;

public class TwoSumMain {

	public static final int TARGET = 10;
	
	public static void main(String[] args) {
		/*
		 * Difficulty - EASY
		 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
		 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
		 */
		int[] myArray = {2,5,5,11};
		// my solution:
		Solution  solution = new Solution();
		int[] answer = solution.twoSum(myArray, TARGET);
		System.out.print("["+answer[0]+","+answer[1]+"]");
		
		
		
		/*rats! the answer is wrong because by sorting the array, you change the original indexes!
		so I gotta actually,keep track of the original array, and then get an int[] of the 2 actual #s
		and then re-look them up in the original array
		but that would cause an added space complexity, wtf!
		
		* hint - I see on the Udemy course that there should be a nlogn solution
		*/
	}

}
