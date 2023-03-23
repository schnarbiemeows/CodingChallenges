package classes;

/**
 * this is not my code
 * this code beat 100%
 * this code makes a count array(like mine)
 * but then iterates does a for-within-a-for
 * in this example a for-within-a-for is still faster than what I did with a hashmap, because of the fact that my
 * hasmap uses objects, so auto-boxing takes more time and memory
 * Lesson here: a for-within-a-for is still faster than O(N) if the O(N) requires objects, whereas for-withi-a-for
 * can stick with primitives
 *
 *      primitives > reducing the Big-O of the algorithm!
 */
public class BestSolution {
    public boolean equalFrequency(String word) {
        int len = word.length();
        int[] count = new int[26];
        for (int i = 0; i < len; ++ i) {
            char c = word.charAt(i);
            count[c - 'a'] ++;
        }
        for (int i = 0; i < len; ++ i) {
            char c = word.charAt(i);
            count[c - 'a'] --;
            if (equalCount(count)) {
                return true;
            }
            count[c - 'a'] ++;
        }

        return false;
    }

    public boolean equalCount(int[] count) {
        int c = 0;

        for (int i: count) {
            if (i == 0) {
                continue;
            } else if (c == 0) {
                c = i;
            } else if (c == i) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}
