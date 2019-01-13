package main;

import classes.Solution;

public class Main {

	/*
	 * difficulty - 
	 * 
	 */
	public static void main(String[] args) {
		String[] input = {"Hello", "Alaska", "Dad", "Peace","you","fuck","b"};
		Solution sol = new Solution();
		String[] output = sol.findWords(input);
		System.out.print("[");
		for(int i=0;i<output.length;i++) {
			System.out.print(output[i]+", ");
		}
		System.out.println("]");
	}

}
