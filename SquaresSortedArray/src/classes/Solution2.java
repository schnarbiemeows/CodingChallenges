package classes;

/**
 * about 15 more minutes
 * using counted sort
 * speed = 54.37%
 * memory = 47.79%
 */
public class Solution2 {
    public int[] sortedSquares(int[] nums) {
        int max = -10000;
        for(int i : nums) {
            max = Math.max(max, Math.abs(i));
        }
        int[] newNums = new int[max+1];
        for(int i : nums) {
            newNums[Math.abs(i)]++;
        }
        int counter = 0;
        for(int i=0;i< newNums.length;i++) {
            if(newNums[i]>0) {
                int count = newNums[i];
                while(count>0) {
                    nums[counter] = i*i;
                    counter++;
                    count--;
                }
            }
        }
        return nums;
    }
}
