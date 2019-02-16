package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * 30
 * yea, this was really hard, took many submissions to figure it out. This is my final solution
 * no submission data was given
 */
public class Solution2 {

	public List<Integer> findSubstring(String s, String[] words) {
		if(words.length==0||s==null||words[0].length()>s.length()) return new ArrayList<Integer>();
		List<Integer> results = new ArrayList<Integer>();
		LinkedList<String> remainList = new LinkedList<>();
		remainList.addAll(Arrays.asList(words));
		List<String> wordsFound = new ArrayList<String>();
		int wordlength = words[0].length();
		for(int i=0;i<=s.length()-wordlength;i++) {
			String word = s.substring(i, i+wordlength);
			if(remainList.contains(word)) {
				/*wordsFound.add(word);
				remainList.remove(word);*/
				int counter=i;
				while(!remainList.isEmpty()&&counter<=s.length()-wordlength) {
					if(remainList.contains(s.substring(counter, counter+wordlength))) {
						wordsFound.add(s.substring(counter, counter+wordlength));
						remainList.remove(s.substring(counter, counter+wordlength));
						counter+=wordlength;
					} else break;
				}
				if(remainList.isEmpty()) {
					results.add(i);
				}
				remainList = new LinkedList<>();
				remainList.addAll(Arrays.asList(words));
				wordsFound.clear();
			}
		}
		return results;
    }
	
}
