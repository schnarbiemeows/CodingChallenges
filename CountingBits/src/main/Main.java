package main;

import classes.Solution;

public class Main {

	/*
	 * 338
	 * difficulty - MEDIUM
	 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate 
	 * the number of 1's in their binary representation and return them as an array.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int n = 62;
		Solution sol = new Solution();
		/*int[] answer = sol.countBits(n);
		System.out.print("[");
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+", ");
		}
		System.out.println("]");*/
		int count = 0;
		System.out.println(n + " : " + count);
		while(n>0){
	          n=n&(n-1);	// this will always strip the rightmost "1" from the binary number
	          count++;
	          System.out.println(n + " : " + count);
	    }
	}

}
