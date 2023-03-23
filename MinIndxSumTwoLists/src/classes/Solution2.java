package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * this one is slower but better memory
 * speed = 20%
 * memory = 86.55%
 */
public class Solution2 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer,List<String>> l1map = new HashMap();
        int minval = Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++) {
            for(int j=0;j<list2.length;j++) {
                if(list1[i].equals(list2[j])) {
                    minval = Math.min(minval,i+j);
                    if(l1map.get(i+j)==null) {
                        List<String> items = new  ArrayList();
                        items.add(list1[i]);
                        l1map.put(i+j,items);
                    } else {
                        l1map.get(i+j).add(list1[i]);
                    }
                }
            }
        }
        if(minval==Integer.MAX_VALUE) return new String[]{};
        String[] answer = new String[l1map.get(minval).size()];
        return l1map.get(minval).toArray(answer);
    }
}
