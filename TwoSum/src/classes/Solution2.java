package classes;

import java.util.HashMap;
import java.util.Map;

/**
 * start = 3:52
 * end = 3:57
 * time = 5 minutes
 * speed = 93.24%
 * memory = 16.56%
 * notes:
 *
 */
public class Solution2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapper = new HashMap();
        for(int i=0;i<nums.length;i++) {
            if(mapper.get(target-nums[i])!=null) {
                return new int[]{i,mapper.get(target-nums[i])};
            } else {
                mapper.put(target-nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
