package classes;

/**
 * this solution is simpler in 3 ways:
 * - uses modulus to determine up/down
 * - does not use a counter
 * - uses a better,simpler version of if-then-else statements that I was using
 * *** my complexity of items 1 and 3 above contributed to multiple little
 *      mistakes, which lead to the excess time for a solution
 * how do I learn to find the better solution? how do I learn to find the pattern?
 */
public class BetterSolution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int r = 0, c = 0, m = matrix.length, n = matrix[0].length, arr[] = new int[m * n];
        for (int i = 0; i < arr.length; i++) {  // not using a counter variable
            arr[i] = matrix[r][c];  // r = y-axis, c = x-axis
            if ((r + c) % 2 == 0) { // moving up, using this modulus to determine if we are going diagonally up
                if      (c == n - 1) { r++; }   // oh, ok, i got the order backwards
                                                /*
                                                if going up then,
                                                if we hit the right wall
                                                else if we hit the top wall
                                                else
                                                 */
                else if (r == 0)     { c++; }
                else            { r--; c++; }
            } else {                // moving down
                if      (r == m - 1) { c++; }   // oh, ok, i got the order backwards
                                                /*
                                                if going down then,
                                                if we hit the bottom wall
                                                else if we hit the left wall
                                                else
                                                 */
                else if (c == 0)     { r++; }
                else            { r++; c--; }
            }
        }
        return arr;
    }
}
