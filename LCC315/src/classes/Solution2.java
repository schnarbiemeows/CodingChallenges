package classes;

import java.util.HashSet;
import java.util.Set;

/**
 * 1,13,10,12,31
 */
public class Solution2 {

    public int countDistinctIntegers(int[] nums) {
        int[] newnums = new int[2*nums.length];
        System.arraycopy(nums,0,newnums,0,nums.length);
        for(int i=0;i<nums.length;i++) {
            newnums[nums.length+i] = reverse(nums[i]);
        }
        Set<Integer> distincts = new HashSet();
        for(int i=0;i< newnums.length;i++) {
            distincts.add(newnums[i]);
        }
        return distincts.size();
    }

    private int reverse(int num) {
        int temp = num;
        int ans = 0;
        while(temp>0) {
            ans = ans*10+temp%10;
            temp = temp/10;
        }
        return ans;
    }
}
