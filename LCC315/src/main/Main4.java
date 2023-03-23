package main;

import classes.HardProblemSolution;
import classes.Solution4;
import classes.Solution44;
import org.w3c.dom.ls.LSOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * 2444. Count Subarrays With Fixed Bounds
 * difficulty - HARD
 * You are given an integer array nums and two integers minK and maxK.
 * A fixed-bound subarray of nums is a subarray that satisfies the following conditions:
 * The minimum value in the subarray is equal to minK.
 * The maximum value in the subarray is equal to maxK.
 * Return the number of fixed-bound subarrays.
 *
 * A subarray is a contiguous part of an array.
 *
 * constraints:
 * 2 <= nums.length <= 10^5
 * 1 <= nums[i], minK, maxK <= 10^6
 */
public class Main4 {
    public static void main(String[] args) throws FileNotFoundException {
        int min = 2;
        int max = 4;
        HardProblemSolution sol = new HardProblemSolution();
        String s = null;
        String[] numsStr = null;
        int[] nums = null;
        try (InputStream input = new FileInputStream("C:\\Users\\dylan\\IdeaProjects\\CodingChallenges\\LCC315\\src\\main\\config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            s = prop.getProperty("test1");
            numsStr = s.split(",");
            nums = new  int[numsStr.length];
            for(int i=0;i<numsStr.length;i++) {
                nums[i] = Integer.valueOf(numsStr[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(nums.length);
        System.out.println(sol.countSubarrays(nums,min, max));
    }

}
