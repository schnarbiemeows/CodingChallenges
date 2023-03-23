package classes;

/*
 * 9:48 - 9:56
 * speed = 9.44%
 * memory = 66.55%
 * rats, got the first submission worng, because I was in a hurry and did not pay attention to this detail:
 * "Given a 1-indexed array of integers numbers"
 * so I had to change lines 18 and 19 to add 1 to each #
 * why so slow?
 *
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int[] ans = new int[2];
        int j = numbers.length-1 ;
            while(i<j) {
                if (numbers[i] + numbers[j] == target) {
                    ans[0]=i+1;
                    ans[1]=j+1;
                    return new int[]{ i+1,j+1};
                } else if(numbers[i] + numbers[j] > target) {
                    j--;
                } else {
                    i++;
                }

            }
        return ans;
    }
}
