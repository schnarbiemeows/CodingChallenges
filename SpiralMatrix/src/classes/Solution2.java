package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * we do for int i = 0 to length of new arrray
 * 2:05 - 2:47 = 42 minutes
 * much easier, but I had to read the hints AND this was after the Solution attempt
 * speed = 100% WOW!
 * memory = 16.90%
 *
 */
public class Solution2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        Integer[] elements = new Integer[matrix.length*matrix[0].length];
        if(matrix.length==1) {
            for(int i=0;i<matrix[0].length;i++) {
                elements[i] = matrix[0][i];
            }
            return Arrays.asList(elements);
        }
        if(matrix[0].length==1) {
            for(int i=0;i<matrix.length;i++) {
                elements[i] = matrix[i][0];
            }
            return Arrays.asList(elements);
        }
        int rtop = 0;
        int rbot = matrix.length-1;
        int cleft = 0;
        int cright = matrix[0].length-1;
        int i=0;
        while(i<elements.length) {
            if(rtop==rbot&&cleft==cright) {
                elements[i] = matrix[rtop][cleft];
                break;
            }
            // go forward
            for(int j = cleft;j<cright;j++) {
                elements[i] = matrix[rtop][j];
                i++;
                if(i== elements.length) {
                    break;
                }
            }
            // go down
            for(int j = rtop;j<rbot;j++) {
                elements[i] = matrix[j][cright];
                i++;
                if(i== elements.length) {
                    break;
                }
            }
            // go left
            for(int j = cright;j>cleft;j--) {
                elements[i] = matrix[rbot][j];
                i++;
                if(i== elements.length) {
                    break;
                }
            }
            // go up;
            for(int j = rbot;j>rtop;j--) {
                elements[i] = matrix[j][cleft];
                i++;
                if(i== elements.length) {
                    break;
                }
            }
            rtop++;
            rbot--;
            cleft++;
            cright--;
        }
        return Arrays.asList(elements);
    }
}
