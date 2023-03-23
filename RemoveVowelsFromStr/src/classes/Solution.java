package classes;

/*
 * start time = 7:22
 * end time = 7:27
 * total time =  5 minutes
 * speed = 48.40 %
 * memory = 12.97 %
 * notes:
 * slow and cumbersome
 */
public class Solution {
    public String removeVowels(String s) {
        String vowels = "aeiou";
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<s.length();i++) {
            if(!vowels.contains(s.substring(i,i+1))) {
                ans.append(s.substring(i,i+1));
            }
        }
        return ans.toString();
    }
}
