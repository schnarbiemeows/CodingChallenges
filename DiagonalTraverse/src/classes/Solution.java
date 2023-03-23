package classes;

/*
 * 6:37 - 7:53
 * speed = 47.97%
 * memory = 21.48%
 * adder = _1 or +1 depending on which direction
 * while counter < M*N
 * when you are going up, you reverse and slide over 1x when y=0,
 * unless x=N.length-1, in which case you reverse and slide down 1y
 * when you are going down, you reverse and slide down 1y when x=0,
 * unless y=M.length-1, in which case you reverse and slide over 1x
 */
public class Solution {

    /**
     * {
     * { 1, 2, 3, 4}
     * { 5, 6, 7, 8}
     * { 9,10,11,12}
     * {13,14,15,16}};
     * @param mat
     * @return
     */
    public int[] findDiagonalOrder(int[][] mat) {
        System.out.println(mat.length);
        System.out.println(mat[0].length);
        int total = mat.length*mat[0].length;
        int[] results = new int[total];
        int counter = 0;
        boolean up = true;
        int x=0;
        int y=0;
        while(counter < total) {
            results[counter] = mat[y][x];
            if(up==true) {
                if(y==0) {
                    up=false;
                    if(x==mat[0].length-1) {
                        y++;
                    } else {
                        x++;
                    }
                } else {
                    if(x==mat[0].length-1) {
                       up=false;
                       y++;
                    } else {
                        x++;
                        y--;
                    }
                }
            } else {
                if(x==0) {
                    up=true;
                    if(y==mat.length-1) {
                        x++;
                    } else {
                        y++;
                    }
                } else {
                    if(y==mat.length-1) {
                        up=true;
                         x++;
                    } else {
                        x--;
                        y++;
                    }
                }
            }
            counter++;
        }
        return results;
    }
}
