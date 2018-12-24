package main;

import classes.Solution;

public class ValidAnagramMain {

	/*
	 * difficulty - EASY
	 * Given two strings s and t , write a function to determine if t is an anagram of s.
	 */
	public static void main(String[] args) {
		String s = "hhbywxfzydbppjxnbhezsxepfexkzofxyqdvcgdvgnjbvihgufvgtuxtpioxgjuwawkbaerbsirrktcjcesepcocaglbassivfbjhikynfsvlbtkawstrclbkpuldshfgfvwjawownulsggsxhhqglbhjlgltfrqyjntgldlgorgatnj";
		String t = "hhbywxfzydbppjxnbhezsxepfexkzofxyqdvcgdvgnjbvihgufvgtuxtpioxgjuwawkbaerbsirrktcjcesepcocaglbassivfbjhikynfsvlbtkawstrclbkpuldshfgfvwjawownulsggsxhhqglbhjlgltfrqyjntgldlgorgatnj";
		Solution sol = new Solution();
		System.out.println(sol.isAnagram(s, t));

	}

}
