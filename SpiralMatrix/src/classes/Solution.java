package classes;

import java.util.ArrayList;
import java.util.List;

/*
 * 1:00 - 1:44
 * speed =
 * memory =
 * the inital boundaries are m x n
 * while the rval and cval are both >=1; do
 *
 */
public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> elements = new ArrayList(matrix.length*matrix[0].length);
            int rval = 0;
            int cval = 0;
            int rtop = 0;
            int rbot = matrix.length-1;
            int cleft = 0;
            int cright = matrix[0].length-1;
            int rdiff = rbot-rtop;
            int cdiff = cright-cleft;
            while(rdiff>0||cdiff>0) {
                do {
                    System.out.print(matrix[rval][cval]+",");
                    elements.add(matrix[rval][cval]);
                    if(cval==cleft&&rval>rtop) { rval--; }    // if its hitting the left wall
                    else if(rval==rbot) { cval--;}  // if its hitting the bottom wall
                    else if(cval==cright) { rval++;}    // if its hitting the right wall
                    else { cval++; }
                } while(rval!=rtop||cval!=cleft);
                rbot--;
                rtop++;
                cleft++;
                cright--;
                rval = rtop;
                cval = cleft;
                rdiff = rbot-rtop;
                cdiff = cright-cleft;
                }
            return elements;
    }
}
