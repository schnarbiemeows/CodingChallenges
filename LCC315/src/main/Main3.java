package main;

import classes.Solution3;

/**
 *  6219. Sum of Number and Its Reverse
 * difficulty - MEDIUM
 * Given a non-negative integer num, return true if num can be expressed as the sum of any
 * non-negative integer and its reverse, or false otherwise.
 *
 * constraints:
 * 0 <= num <= 10^5
 */
public class Main3 {

    public static void main(String[] args) {

        int num = 63;
        Solution3 sol = new Solution3();
        System.out.println(sol.sumOfNumberAndReverse(num));
    }
}
