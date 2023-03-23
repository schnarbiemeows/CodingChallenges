package classes;

import java.util.ArrayList;
import java.util.List;

/*
 * 6:27 - 6:47
 * speed =  80.26%
 * memory = 8.28%
 *
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> firstList = new ArrayList();
        firstList.add(1);
        result.add(firstList);
        for(int i=1;i<numRows;i++) {
            List<Integer> tempList = new ArrayList();
            List<Integer> previousLIst = result.get(i-1);
            for(int j=0;j<previousLIst.size()+1;j++) {
                if(j==0) {
                    tempList.add(previousLIst.get(j));
                } else if(j==previousLIst.size()) {
                    tempList.add(previousLIst.get(j-1));
                } else {
                    tempList.add(previousLIst.get(j)+previousLIst.get(j-1));
                }
            }
            result.add(tempList);
        }
        return result;
    }
}
