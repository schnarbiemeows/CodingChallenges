package classes;

/**
 * this solution was taken from someone else's anser
 * the problem I was having when iterating from end to beginning was that
 * the indexed number was being replaced by the max, which could affect other
 * maxes, but what I failed to realize was that, if the # being replaced is not
 * itself a max, it doesn't matter, so keep track of a max and a temp
 */
public class Solution2 {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i=arr.length-1;i>=0;i--) {
            int temp = arr[i];
            arr[i]=max; // setting it to -1 sets the last item to -1! ... also if there's only 1 item in the array
            max = Math.max(temp,max);
        }
        return arr;
    }
}
