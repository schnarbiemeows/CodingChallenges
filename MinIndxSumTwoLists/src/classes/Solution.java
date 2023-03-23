package classes;

import java.util.HashMap;
import java.util.Map;

/*
 * start time = 5:50
 * end time = 6:03
 * total time = 13 minutes
 * speed = 27.14 %
 * memory = 7.51 %
 * notes:
 *
 */
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> l1map = new HashMap();
        Map<String,Integer> l2map = new HashMap();
        for(int i=0;i<list1.length;i++) {
            l1map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++) {
            l2map.put(list2[i],i);
        }
        int minsum = Integer.MAX_VALUE;
        String properkey = "";
        for(String key: l1map.keySet()) {
            if(l2map.containsKey(key)) {
                if(l1map.get(key)+ l2map.get(key)<minsum) {
                    minsum = l1map.get(key)+ l2map.get(key);
                    properkey = key;
                } else if(l1map.get(key)+ l2map.get(key)==minsum) {
                    properkey = properkey+","+key;
                }
            }
        }
        if(properkey.endsWith(",")) properkey = properkey.substring(0,properkey.length()-1);
        if(properkey.length()==0) return new  String[]{};
        return properkey.split(",");
    }
}
