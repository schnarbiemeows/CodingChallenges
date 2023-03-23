package classes;

import java.util.HashMap;
import java.util.Map;

/*
 * start time = 8:28
 * end time = 10:08
 * total time = 110 minutes, but I was doing other stuff(work, cats, cooking)
 * speed = 75.91 %
 * memory = 74.82 %
 * notes:
 * this was the hardest of the easy ones
 */
public class Solution {
    public boolean equalFrequency(String word) {
        int[] mapper = new int[26];
        char[] chars = word.toCharArray();
        Map<Integer,Integer> second = new HashMap();
        for(int i=0;i<chars.length;i++) {
            mapper[chars[i]-'a']++;
        }
        for(int i=0;i<mapper.length;i++) {
            if(mapper[i]>0) {
                if(second.containsKey(mapper[i])) {
                    Integer val = second.get(mapper[i]);
                    val++;
                    second.put(mapper[i],val);
                } else {
                    second.put(mapper[i],1);
                }
            }
        }
        if(second.keySet().size()==1) {
            for(Integer key: second.keySet()) {
                if(key==1&&second.get(key)==word.length()||key==word.length())  {       // all characters appear only once, or its only 1 character
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        if(second.keySet().size()>2) return false; // if there are more than 2 different frequencies, has to be false
        // else, only two frequencies
        // if min frequency ===1 AND there is only 1 char, then we can just remove that char
        int count = 0;
        int firstKey = 0;
        int secondKey = 0;
        for(Integer key: second.keySet()) {
            if(count==0) {
                firstKey=key;
                count++;
            } else {
                secondKey=key;
            }
        }
        if(second.get(firstKey)>1&&second.get(secondKey)>1) return false;   // one of these has to be 1
        if(secondKey==1&&second.get(secondKey)==1||firstKey==1&&second.get(firstKey)==1) return true;   // if the one that has 1 only has one, we can remove that letter
        // finally, if the higher one has only 1 then true;
        if(firstKey>secondKey) {
            if(firstKey-secondKey==1&&second.get(firstKey)==1) return true;
        }
        if(secondKey>firstKey) {
            if(secondKey-firstKey==1&&second.get(secondKey)==1) return true;
        }
        return false;
    }
}
