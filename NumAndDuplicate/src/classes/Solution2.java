package classes;

import java.util.HashMap;
import java.util.Map;

/**
 * 11:01
 */
public class Solution2 {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,Boolean> numMap = new HashMap();
        for(int i=0;i<arr.length;i++) {
            numMap.put(arr[i],true);
        }
        for(int j=0;j<arr.length;j++) {
            if((numMap.containsKey(arr[j]*2))||(numMap.containsKey(arr[j]/2)&&arr[j]%2==0)) {
                return true;
            }
        }
        return false;
    }
}
