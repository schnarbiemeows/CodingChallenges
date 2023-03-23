package main;

import classes.Solution;
import classes.Solution2;
import classes.Solution3;
import classes.Solution4;

public class Main {

	/*
		1119
	 * difficulty - EASY
	 * description:
	 * Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
	 * constraints:
	 * 1 <= s.length <= 1000
	 s consists of only lowercase English letters.
	 */
	public static void main(String[] args) {

		Solution4 sol = new Solution4();
		String s = "leetcodeisacommunityforcoders";
		System.out.println(sol.removeVowels(s));
		s = "aeiou";
		System.out.println(sol.removeVowels(s));
	}

}
