package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 784
 * cool, beat 99.44% of submission for speed
 * but only 18.33% for memory
 */
public class Solution {

	public List<String> letterCasePermutation(String S) {
        char[] letters = S.toCharArray();
        char[] word = Arrays.copyOf(letters, letters.length);
        List<String> answer = new ArrayList<String>();
        transform(letters,answer,word,0);
        return answer;
    }
	
	public void transform(char[] letters, List<String> words, char[] word, int index) {
		if(index==letters.length) words.add(String.valueOf(word));
		else {
			if(letters[index]<65) {
				transform(letters,words,word,index+1);
			} else if(letters[index]>96) {
				char[] word2 = Arrays.copyOf(word,word.length);
				word2[index]-=32;
				transform(letters,words,word,index+1);
				transform(letters,words,word2,index+1);
			} else {
				char[] word2 = Arrays.copyOf(word,word.length);
				word2[index]+=32;
				transform(letters,words,word,index+1);
				transform(letters,words,word2,index+1);
			}
		}
	}
}
