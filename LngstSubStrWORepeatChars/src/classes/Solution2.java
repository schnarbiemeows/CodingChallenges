package classes;

import java.util.HashSet;
import java.util.Set;

/**
 * much better
 * speed = 61.12%
 * memory = 81.92%
 */
public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if(s==null|| s.isEmpty()) return 0;
        char[] chars = s.toCharArray();
        int answer = 1;
        int count = 1;
        int[] indexer = new int[95];
        indexer[chars[0]-32]++;
        for(int i=1;i<chars.length;i++) {
            if(indexer[chars[i]-32]==1) {
                answer = Math.max(answer,count);
                for(int j=0;j<indexer.length;j++) {
                    indexer[j]=0;
                }
                count = redoCount(indexer,chars,i);
            }
            indexer[chars[i]-32]++;
            count++;
        }
        return Math.max(answer,count);
    }

    private int redoCount(int[] indexer, char[] chars, int i) {
        int j = i-1;
        int count = 0;
        while(chars[j]!=chars[i]) {
            indexer[chars[j]-32]++;
            count++;
            j--;
        }
        return count;
    }
}
