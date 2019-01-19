package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/*
 * 884 - 
 * ok, first try, basic brute force, no submission errors, small copy/paste from text file errors,
 * beat 71.46% 
 */
public class Solution {

	public String[] uncommonFromSentences(String A, String B) {
        HashMap<String,Integer> wordmap = new HashMap<String,Integer>(400);
        String[] words1 = A.split(" ");
        String[] words2 = B.split(" ");
        for(int i=0;i<words1.length;i++) {
        	if(null==wordmap.get(words1[i])) wordmap.put(words1[i],new Integer(1));
        	else wordmap.put(words1[i],wordmap.get(words1[i])+1);
        }
        for(int i=0;i<words2.length;i++) {
        	if(null==wordmap.get(words2[i])) wordmap.put(words2[i],new Integer(1));
        	else wordmap.put(words2[i],wordmap.get(words2[i])+1);
        }
        List<String> words = new ArrayList<String>();
        Iterator wordmapiter = wordmap.keySet().iterator();
        while(wordmapiter.hasNext()) {
        	String key = (String) wordmapiter.next();
        	int count = wordmap.get(key);
        	if(count==1) words.add(key);
        }
        String[] answer = new String[words.size()];
        return words.toArray(answer);
    }
}
