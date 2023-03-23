package classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    https://leetcode.com/problems/wiggle-subsequence/solution/
 */
public class Answer {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        // with the above and the "1" below, they are stating that they know that the answer is at least 1
        // with this below, by doing "calculate" twice with both up and down, they don't have to know
        // whether the first direction is up or down, but the first one checks if the difference is the
        // same as the direction, whereas the second checks if the difference is the opposite of the direction
        List<Integer> asList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println("initial array = " + asList.toString());
        System.out.println("PERFORMING SAME CALCULATIONS\n");
        int upCalcs = calculate(nums, 0, true,"");
        System.out.println("\nPERFORMING CONTRAY CALCULATIONS\n");
        int downCalcs = calculate(nums, 0, false,"");
        return 1 + Math.max(upCalcs,downCalcs);
    }

    private int calculate(int[] nums, int index, boolean isUp, String tabs) {
        int maxcount = 0;
        System.out.println(tabs + "is direction up? = " + String.valueOf(isUp).toUpperCase());
        System.out.println(tabs+"The size of the array that we are working with here is = " + (nums.length-index));
        if(nums.length-index==1) {
            System.out.println(tabs+"no actions, returning ZERO");
        }
        for (int i = index + 1; i < nums.length; i++) {
            // they are always looking at the one "behind them"
            System.out.println(tabs + "comapring index (" + i + ") = " + nums[i] + " , with index (" + index + ") = " + nums[index]);
            boolean isgreaterThan = nums[i] > nums[index];
            boolean isLessThan = nums[i] < nums[index];
            boolean isGreaterThanAndIsUp = isUp && isgreaterThan;
            boolean isLessThanAndIsDown = !isUp && isLessThan;
            System.out.println(tabs+"is direction up? = " + String.valueOf(isUp).toUpperCase() +" , isGreaterThanAndIsUp = "+isGreaterThanAndIsUp+" , isLessThanAndIsDown = " + isLessThanAndIsDown);
            if ((isGreaterThanAndIsUp) || (isLessThanAndIsDown)) {
                System.out.println(tabs+"Going to the next level...........");
                int tempNum = calculate(nums, i, !isUp, tabs+"\t");
                System.out.println(tabs+"comparing the returned value : " + tempNum + "+1 WITH current maxcount : + " + maxcount);
                maxcount = Math.max(maxcount, 1 + tempNum);
            } else {
                System.out.println(tabs+"nums[i] = " + nums[i] + " and nums[index] = " + nums[index] + " are either the same or the comparisons are false, so skipping");
            }
        }
        System.out.println(tabs+"RETURNING the value : " + maxcount);
        return maxcount;
    }

    /**
     * X0,[X1,X2,X3,X4.....,Xn]
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
