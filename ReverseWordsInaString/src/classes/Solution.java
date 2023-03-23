package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * start time = 9:48
 * end time = 10:05
 * total time = 17 minutes
 * speed = 43.13 %
 * memory = 33.60 %
 * notes:
 * make a List<String>
 */
public class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList();
        char[] chars = s.toCharArray();
        int i=0;
        while(i<chars.length) {
            StringBuilder sb= new StringBuilder();
            if(chars[i]!=' ') {
                int j=i;
                while(j<chars.length&&chars[j]!=' ') {
                    sb.append(chars[j]+"");
                    j++;
                }
                words.add(sb.toString());
                i=j;
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for(i=words.size()-1;i>=0;i--) {
            sb.append(words.get(i)+" ");
        }
        String answer = sb.toString();
        if(answer.length()>0) {
            return answer.substring(0,answer.length()-1);
        }
        else return "";
    }
}
