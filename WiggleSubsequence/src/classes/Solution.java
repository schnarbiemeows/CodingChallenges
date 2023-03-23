package classes;

import java.util.ArrayList;
import java.util.List;

/*
 * did this on 07/04/2022
 * - in 2 hours I got somethign working, but it gives the wrong answer
 * - I have attached the brute force answer and the link
 * - what did I get right?
 *      - that if the size was one, return 1
 *      - that the
 * need to find all possible subsequence of the original sequence
 * which would be 1 + nums + nums^2 + nums^3 .... nums^(nums-1)
 * but all we have to do is find the longest one
 * all possible sequences that start with the 1st num
 * all that start with the 2nd num
 * all with 3rd...
 * but you wouldnt find the longest in a smaller set but not in the larger
 * the only reason it wouldnt contain the 1st num would be because the second num was the same
 * so the sequence contains the first num
 * each number after the current number can either be added to the sequence, or it can be removed
 * we would remove it if by doing so, we could get a longer sequence
 * when we remove a number, it is because we want to keep the current direction the same
 * - how do we figure that out?
 * - method to return the total length of the rest of the sequence
 */
public class Solution {

    /**
     * 1 <= nums.length <= 1000
     * 0 <= nums[i] <= 1000
     * @param nums
     * @return
     */
    public int wiggleMaxLength(int[] nums) {
        if(nums.length==1) return 1;    // only 1 item
        List<Integer> newNums = new ArrayList();
        int start = 0;
        boolean found = false;
        int dir = 0; // -1 for neg, 1 for pos, 0 for same
        while(!found&&start<=nums.length-2) {
            // find the next number that is not the same, the sequence could start with 1,1,1,1,1,....
            if(nums[start]==nums[start+1]) {
                start++;
            } else {
                found=true;
                if(nums[start]>nums[start+1]) {
                    dir = -1;
                } else if(nums[start]<nums[start+1]) {
                    dir = 1;
                }
            }
        }
        if(!found) return 1;
        // otherwise we now have a starting position, and a next direction
        newNums =  lengthOfRestOfSequence(nums,newNums,nums.length,start,dir,0);
        System.out.println("array = " + newNums.toString());
        return newNums.size();
    }
    public List<Integer> lengthOfRestOfSequence(int[] nums, List<Integer> newNums, int max, int index, int direction, int count) {
        if(index==max-1) {
            if(nums[index]-nums[index-1]>0&&-direction>0) { // it goes up and we want up
                newNums.add(nums[index]);
            }
            else if(nums[index]-nums[index-1]<0&&-direction<0) { // it goes up and we want up
                newNums.add(nums[index]);
            }
            return newNums;
        }
        /**
         * do something here that
         */
        if(howManyFlipsLeft(nums,index,nums[index],direction)>howManyFlipsLeft(nums,index+1,nums[index+1],direction)) {
            // adding the current number would result in the maximum sequence
            newNums.add(nums[index]);
            return lengthOfRestOfSequence(nums,newNums,max,index+1,-direction,count+1);
        } else {
            // else skip the current number because this will result in a larger sequence
            return lengthOfRestOfSequence(nums,newNums,max,index+1,direction,count);
        }
    }

    public int howManyFlipsLeft(int[] nums, int index, int current, int nextdir) {
        if(index>=nums.length-1) return 0;
        int count = 0;
        int temp = current;
        for(int i=index;i<nums.length-1;i++) {
            if(nums[i+1]-temp>0&&nextdir>0) { // it goes up and we want up
                count++;
                temp = nums[i+1];
                nextdir = -1;
            }
            else if(nums[i+1]-temp<0&&nextdir<0) { // it goes down and we want down
                count++;
                temp = nums[i+1];
                nextdir = 1;
            }
            else return count;  // as soon as it doesn't go the way we need, return the count;
        }
        // if it gets to teh end, return the count;
        return count;
    }
}
