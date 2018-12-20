package classes;

import java.util.HashMap;

public class Solution {

	public int numJewelsInStones(String J, String S) {
		// letters in J are distinct, so no more than one of each type
		// we also only need to know how many total jewels we have, not
		// how many of each type, so we can make a map, put each item in J
		// into the map, and then for each item in S, if the map contains the
		// item, then increment total jewels by 1
		// so this would have a Big-O of O(J+s) = O(n)
		int totalNumberOfJewels = 0;
		HashMap<String,String> jewels = new HashMap<String,String>();
		for(int i=0;i<J.length();i++) {
			String item = J.substring(i, i+1);
			jewels.put(item, item);
		}
		for(int j=0;j<S.length();j++) {
			String item = S.substring(j, j+1);
			if(J.contains(item)) totalNumberOfJewels++;
		}
		return totalNumberOfJewels;
	}
}
