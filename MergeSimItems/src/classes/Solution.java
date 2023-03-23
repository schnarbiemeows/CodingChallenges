package classes;

import java.util.ArrayList;
import java.util.List;

/*
 * start time = 12:29
 * end time = 12:40
 * total time =  11 minutes
 * speed =  70.72%
 * memory =  22.64%
 * notes:
 *
 */
public class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] temp = new int[1001];
        for(int[] item: items1) {
            temp[item[0]] = item[1];
        }
        for(int[] item: items2) {
            temp[item[0]] += item[1];
        }
        List<List<Integer>> ans = new ArrayList();
        for(int i=0;i<temp.length;i++) {
            if (temp[i]>0) {
                List<Integer> item = new ArrayList();
                        item.add(i);
                item.add(temp[i]);
                ans.add(item);
            }
        }
        return ans;
    }
}
