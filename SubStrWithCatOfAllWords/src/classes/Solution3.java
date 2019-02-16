package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * 30
 * 
 */
public class Solution3 {

	 public List<Integer> findSubstring(String s, String[] words) {
	        List<Integer> result = new ArrayList<>();
	        if (words == null || words.length == 0) return result;
	        List<String> remainList = new LinkedList<>(); // contains the remaining words
	        List<String> containList = new LinkedList<>(); // contains the matched words
	        remainList.addAll(Arrays.asList(words));
	        int length = words[0].length();

	        for (int i = 0; i <= s.length() - length; i++) {
	            if (remainList.contains(s.substring(i, i + length))) {
	                int p = i;
	                while (remainList.size() > 0 && p <= s.length() - length) {
	                    String substring = s.substring(p, p + length);
	                    if (remainList.contains(substring)) {
	                        remainList.remove(substring);
	                        containList.add(substring);
	                        p = p + length;
	                    } else {
	                        break;
	                    }
	                }
	                if (remainList.size() == 0) {
	                    result.add(i);
	                }
	                remainList.addAll(containList);
	                containList.clear();
	            }
	        }
	        return result;
	    }
	
}
