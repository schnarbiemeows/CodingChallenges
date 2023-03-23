package classes;

/*
 * start time = 4:50
 * end time = 4:55
 * total time = 5 minutes
 * speed = 54.15 %
 * memory = 24.42 %
 * notes:
 * hmm, slow
 * ok, i found another person's answer that was exactly like this, and they got 99% , so
 *
 */
public class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = -1;
        for(int i=0; i<sentences.length;i++) {
            max = Math.max(max, sentences[i].split(" ").length);
        }
        return max;
    }
}
