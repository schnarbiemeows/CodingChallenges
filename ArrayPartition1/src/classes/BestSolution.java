package classes;

/**
 * this solution is the best because it uses a counting sort to sort
 * speed = 98.20%
 * memory = 5.25%
 * the key here is this constraint:
 * All the integers in the array will be in the range of [-10000, 10000].
 */
public class BestSolution {
    public int arrayPairSum(int[] nums) {
        int[] sorter = new int[20001];  // all negative, all positives, and zero
        for(int i=0;i<nums.length;i++) {
            sorter[nums[i]+10000]++;
        }
        boolean odd = true;
        int sum = 0;
        int pairs = nums.length/2;  // we don't want to iterate through the entire sorter, we want
                                    // to quit as soon as we found the last pair
        int sorterindex = 0;        // we need this also
        while(pairs>0) {
            while (sorter[sorterindex] > 0&&pairs>0) {
                if (odd) {
                    sum += sorterindex - 10000;
                    pairs--;
                }
                odd = !odd;
                sorter[sorterindex]--;
            }
            sorterindex++;
        }
        return sum;
    }
}
