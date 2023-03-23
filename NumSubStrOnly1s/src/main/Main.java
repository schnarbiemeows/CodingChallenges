package main;

import classes.BestSolution;
import classes.Solution;
import classes.Solution2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

	/**
	 * 1513
	 * difficulty - MEDIUM
	 * description:
	 * Given a binary string s, return the number of substrings with all characters 1's.
	 * Since the answer may be too large, return it modulo 10^9 + 7.
	 * constraints:
	 * 1 <= s.length <= 10^5
	 * s[i] is either '0' or '1'
	 */
	public static void main(String[] args) throws FileNotFoundException {
		BestSolution sol = new BestSolution();
		String s = null;
		try (InputStream input = new FileInputStream("C:\\Users\\dylan\\IdeaProjects\\CodingChallenges\\NumSubStrOnly1s\\src\\main\\temp.properties")) {
			Properties prop = new Properties();
			prop.load(input);
			s = prop.getProperty("string");

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		System.out.println(sol.numSub(s));
		s = "101";
		//System.out.println(sol.numSub(s));
		s = "111111";
		//System.out.println(sol.numSub(s));
	}

}
