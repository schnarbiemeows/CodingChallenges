package classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * time limit exceeded on this one, rats
 */
public class Solution44 {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        long totalCombos = 0;
        int index = 0;
        int minlength = 2;
        if(minK==maxK) {
            minlength=1;
            while(index<nums.length) {
                if(nums[index]!=minK) {
                    int start = findStart(nums,index,minK,maxK);
                    totalCombos+=comboCount(nums,index,start,minK,maxK,minlength,index-start);
                }
                index++;
            }
        } else {
            while(index<nums.length) {
                if(nums[index]>maxK||nums[index]<minK) {
                    int start = findStart(nums,index,minK,maxK);
                    totalCombos+=comboCount(nums,index,start,minK,maxK,minlength,index-start);
                }
                index++;
            }
        }
        int start = findStart(nums,nums.length,minK,maxK);
        totalCombos+=comboCount(nums,index,start,minK,maxK,minlength,nums.length-start);
        return totalCombos;
    }

    private int findStart(int[] nums, int front, int min, int max ) {
        if(front>0) {
            int i=front-1;
            while(i>=0) {
                if(nums[i]>max||nums[i]<min) {
                    return i+1;
                }
                i--;
            }
            return i+1;
        }
        else {
            return 0;
        }
    }

    public long comboCount(int[] nums, int front, int rear, int min, int max, int minlength, int width) {
        System.out.println("start = " + rear + " , end = " + front + " minlength = " + minlength);
        if(minlength==1) {
            long frontL = front;
            long backL = rear;
            long ans = (frontL-backL)*(frontL-backL+1)/2L;
            System.out.println("answer is = " + ans);
            return ans;
        }
        long subtotal = 0;
        while(width>0) {
            for(int i=rear;i<=front-width;i++) {
                if(hasBothMinAndMax(nums,i+width,i,min,max)) {
                    subtotal+=1;
                }

            }
            width--;
        }
        return subtotal;
    }

    private boolean hasBothMinAndMax(int[] nums, int front, int rear, int min, int max) {
        boolean hasMin = false;
        boolean hasMax = false;
        for(int i=rear;i<front;i++) {
            if(nums[i]==min) {
                hasMin=true;
            }
            if(nums[i]==max) {
                hasMax = true;
            }
        }
        return hasMax&&hasMin;
    }
}
