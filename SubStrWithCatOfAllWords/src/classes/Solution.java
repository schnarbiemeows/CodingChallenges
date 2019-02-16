package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/*
 * 30
 * 
 */
public class Solution {

	Object lock = new Object();
	public List<Integer> findSubstring(String s, String[] words) {
        if(words.length==0||s==null||words[0].length()>s.length()) return new ArrayList<Integer>();
        List<String> wordlist = new ArrayList<String>();
        List<String> currentwords = Arrays.asList(words);
        makeWordList(currentwords,wordlist,"");
        
        Stream<String> wordStream = wordlist.stream();
        Stream<String> wordlist2 = wordStream.filter(x-> s.contains(x));
        Object[] items = wordlist2.toArray();
        Set<Integer> numbers = new HashSet<Integer>();
        for(int i=0;i<items.length;i++) {
        	String word = items[i].toString();
        	int nextIndex=0;
        	while(nextIndex<s.length()&&s.indexOf(word,nextIndex)!=-1) {
        		numbers.add(s.indexOf(word,nextIndex));
        		nextIndex++;
        	}
        }
        List<Object> result = Arrays.asList(numbers.toArray());
        List<Integer> results = new ArrayList<Integer>();
        for(Object item: result) {
        	Integer num = (Integer)item;
        	results.add(num);
        }
        return results;
    }
	
	public void makeWordList(List<String> currentwords, List<String> wordlist, String s) {
    	if(currentwords.isEmpty()) {
    		synchronized(lock) {
    		wordlist.add(s.toString());
    		};
    	}
    	else {
    		for(String x: currentwords) {
    			String newsb = s+x;
    			List<String> subwords = new ArrayList<String>(currentwords);
    			subwords.remove(x);
    			makeWordList(subwords,wordlist,newsb);
    		}
    	}
    }
}
