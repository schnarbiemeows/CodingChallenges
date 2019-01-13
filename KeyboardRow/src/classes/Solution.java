package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * first submission had wrong answer because I assumed all words would be valid words, but the
 * failed test case had "b" as a word.
 * second submission passed, and beat 83.74% of the submissions
 */
public class Solution {

	public String[] findWords(String[] words) {
        char[] middleline = {'a','s','d','f','g','h','j','k','l'};
        char[] topline = {'z','x','c','v','b','n','m'};
        List<String> answerList = new ArrayList<String>();
        for(int i=0;i<words.length;i++) {
        	boolean intop=false,inbottom=false,inneither=false,validword=true;
        	char[] chars = words[i].toCharArray();
        	for(int j=0;j<chars.length;j++) {
        		char letter = chars[j];
        		boolean foundtop=false,foundbottom=false;
        		if(letter<97) {
        			letter+=32;
        		}
        		for(int k=0;k<topline.length;k++) {
        			if(letter==topline[k]) {
        				intop=true;
        				foundtop=true;
        			}
        		}
        		for(int k=0;k<middleline.length;k++) {
        			if(letter==middleline[k]) {
        				inbottom=true;
        				foundbottom=true;
        			}
        		}
        		if(!foundtop&&!foundbottom) inneither=true;
        		if(intop&&inbottom||intop&&inneither||inbottom&&inneither) {
        			validword=false;
        			break;
        		}
        	}
        	if(validword) answerList.add(words[i]);
        }
        String[] answer = new String[answerList.size()];
        for(int i=0;i<answer.length;i++) {
        	answer[i] = answerList.get(i);
        }
        return answer;
    }
}
