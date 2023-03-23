package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 12:33 - 12:57
 * speed = 99.99%!!!!!!
 * memory = 97.42%!!!!
 * wow, counting sort, even though it had 10^5 elements in it potentially
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> returns = new ArrayList();
        int[] newNums = new int[nums.length];
        for(int num : nums) {
            newNums[num-1]++;
        }
        for(int i=0;i<newNums.length;i++) {
            if(newNums[i]==0) {
                returns.add(i+1);
            }
        }
        return returns;
    }
}
