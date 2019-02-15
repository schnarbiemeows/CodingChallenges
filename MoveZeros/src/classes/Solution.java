package classes;

/*
 * 283
 * crap, I had a wrong answer that failed on [2,1]
 * but the second submission beat 100% speed
 * no memory stats available
 */
public class Solution {

	public void moveZeroes(int[] nums) {
        int last=-1;
        if(nums[0]>0) last=0;
        boolean zerofound=false;
        for(int i=last+1;i<nums.length;i++) {
        	switch(nums[i]) { 
        	case 0 : zerofound=true;
        			 break;
        	default :		nums[++last]=nums[i];
        					if(zerofound) nums[i]=0;
        		}
        	}
    }
}
