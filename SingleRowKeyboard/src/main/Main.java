package main;

import classes.Solution;

public class Main {

	/**
	 * 1165
	 * difficulty - easy
	 * description:
	 * There is a special keyboard with all keys in a single row.
	 *
	 * Given a string keyboard of length 26 indicating the layout of the keyboard
	 * (indexed from 0 to 25). Initially, your finger is at index 0.
	 * To type a character, you have to move your finger to the index of the desired character.
	 * The time taken to move your finger from index i to index j is |i - j|.
	 *
	 * You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.
	 * constraints:
	 * keyboard.length == 26
	 * keyboard contains each English lowercase letter exactly once in some order.
	 * 1 <= word.length <= 104
	 * word[i] is an English lowercase letter.
	 */
	public static void main(String[] args) {
		Solution sol = new Solution();
		String keyboard = "azcdefghijklmnopqrstuvwxyb";
		String word = "ab";
		System.out.println(sol.calculateTime(keyboard,word));
	}

}
