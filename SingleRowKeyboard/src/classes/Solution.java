package classes;

/*
 * start time = 7:16
 * end time = the next morning(Schnarbies convinced me to quit and go to bed)
 * total time =  minutes
 * speed = 41.7 %
 * memory = 73.55 %
 * notes:
 * hmm, not sure why its so slow
 */
public class Solution {
    public int calculateTime(String keyboard, String word) {
        int[] indexes = new int[26];
        char[] keys = keyboard.toCharArray();
        for(int i = 0; i<keys.length;i++) {
            indexes[keys[i]-'a']=i;
        }
        char[] chars = word.toCharArray();
        int total = indexes[chars[0]-'a'];
        for(int i=1;i<chars.length;i++) {
            total+=Math.abs((indexes[chars[i]-'a'])-(indexes[chars[i-1]-'a']));
        }
        return total;
    }
}
