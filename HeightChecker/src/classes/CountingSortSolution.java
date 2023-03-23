package classes;

/**
 * this is a type of sort called a counting sort, which has O(n) complexity
 * since we know the total range of values for the height, we make an array of length = range
 *
 */
public class CountingSortSolution {
    public int heightChecker(int[] heights) {
        int[] heightToFreq = new int[101];

        for (int height : heights) {
            heightToFreq[height]++;
        }

        int result = 0;
        int curHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }

            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }

        return result;
    }
}
