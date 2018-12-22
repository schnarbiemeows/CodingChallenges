package classes;

import java.util.HashSet;

public class Solution {
	/* 
	 * first submission, no failures, beat 53.48% of submissions
	 */
	public int uniqueMorseRepresentations(String[] words) {
		String[] letters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
				"---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		HashSet<String> items = new HashSet<String>();
		for(int i=0;i<words.length;i++) {
			String item = words[i];
			String morseEquivalent = "";
			for(int j=0;j<item.length();j++) {
				char letter = (char)item.charAt(j);
				morseEquivalent+=letters[letter-97];
			}
			items.add(morseEquivalent);
			
		}
		return items.size();
	}
}
