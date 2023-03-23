package classes;

import java.util.ArrayList;
import java.util.List;

/*
 * start time = 8:53
 * end time = 9:07
 * speed = 30.65%
 * memory = 16.57%
 * notes:
 *
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList();
        List<Integer> rowZero = new ArrayList();
        rowZero.add(1);
        triangle.add(rowZero);
        List<Integer> answer = null;
        for(int i=1;i<=rowIndex;i++) {
            List<Integer> temp = new ArrayList();
            temp.add(1);
            for(int j=1;j<i;j++) {
                int sum = triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j);
                temp.add(sum);
            }
            temp.add(1);
            triangle.add(temp);
        }
        answer = triangle.get(triangle.size()-1);
        return answer;
    }
}
