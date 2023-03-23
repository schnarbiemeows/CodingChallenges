package main;

import classes.Solution;
import classes.Solution2;

public class Main {

	/*
	 * difficulty - EASY
	 * Given an array arr of integers, check if there exist two indices i and j such that :
	 * i != j
	 * 0 <= i, j < arr.length
	 * arr[i] == 2 * arr[j]
	 *
	 * what did I fuck up on this one?
	 * 1. did not read the problem correctly - arr[i] counld be 2* arr[j], or the other way around
	 * 2. did not account for arr[i] = arr[j]/2 to be int division so needed the extra "&&arr[j]%2=0
	 * 3. did not account for 0 , 0=2*0
	 * 4. did not account for needing 2 0's if there is a zero
	 * 5. did not consider using a HashSet to store the numbers
	 */
	public static void main(String[] args) {

		int[] arr = {-2,0,10,-19,4,6,-8};
		Solution2 sol = new Solution2();
		System.out.println(sol.checkIfExist(arr));
	}

}
