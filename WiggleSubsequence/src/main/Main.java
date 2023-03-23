package main;

import classes.Answer;
import classes.Solution;

/**
 * 7:58 - 9:48 - I got a solution that compiles and executes, but does not give the correct output
 */
public class Main {
    public static void main(String[] args) {
        //int[] nums = {1,17,5,10,13,15,10,5,16,8};
        int[] nums = {1,2,3,1,2};
        //Solution sol = new Solution();
        Answer sol = new Answer();
        System.out.println(sol.wiggleMaxLength(nums));
    }
}
