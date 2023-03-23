package classes;

import java.util.Date;

/**
 * using what I learned from the NumSubStrOnly1s.BestSolution class
 * hmm
 */
public class HardProblemSolution {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        long start = new Date().getTime();
        long numsubs = 0;
        // if minK == maxK , its a different situation

        /**
         * 1. go find every range of valid #'s(numbers that lie within mink<= X <= maxK
         *  by finding all the indexes of invalid #s
         *      1a - first count the total
         *      1b - make int[] of that length
         *      1c - populate the array
         */
        int totalInvalids = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>maxK||nums[i]<minK) {
                totalInvalids++;
            }
        }
        int[] invalidIndexes = new int[totalInvalids];
        int index = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>maxK||nums[i]<minK) invalidIndexes[index++]=i;
        }
        /**
         * 2. now go make another int[] of ranges form this first int[] using only the ones that are > 1 from each other
         */
        int i=0;
        int rangesCount = 0;
        while(i<index-1) {
            if(invalidIndexes[i+1]-invalidIndexes[i]>2) {       // 2 beacuase the max and min must be different
                rangesCount++;
            }
            i++;
        }
        /**
         * TODO - we have to check both ends of the array to see if we need to include a beginning and end range
         * this is working but not including them
         */
        int[] ranges = new int[2*rangesCount];
        i=0;
        rangesCount = 0;
        while(i<index-1) {
            if(invalidIndexes[i+1]-invalidIndexes[i]>2) {
                ranges[rangesCount++]=invalidIndexes[i]+1;  // so start index is first valid after invalid
                ranges[rangesCount++]=invalidIndexes[i+1]-1; // so end index is index before invalid
            }
            i++;
        }

        /**
         *
         */
        long end = new Date().getTime();
        System.out.println("total time = " + (end-start) + " milliseconds");
        return numsubs;
    }


}
