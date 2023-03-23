package classes;

/**
 * you have to find every combination of subarrays
 * for each subarray, check to see if its min and max are the min and max of the array, if so, its a valid subarray
 * but I don't think this will work because there could be up to 10000 alaments which means
 *
 * I'm not going to finish this, so let me just pontificate:
 * the strategy below is kinda like an inchworm strategy using 2 pointers,
 * where you start by finding a min OR max with one pointer, then go from there with the other pointer until:
 * - you find the other OR
 * - you find an invalid character
 *
 * any time you find a min and a max, AT THAT POINT, the min/max are at the ends, and you spread out from each side
 * until both sides find either the end or they both find invalid characters
 *
 *
 * OR you could instead inchworm looking for invalids, and then , take that sub-array, and , if it has both
 * the min and the max, then the total combos is = n*(N+1)/2
 */
public class Solution4 {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        if(nums.length==2) {
            if(nums[0]==minK&&nums[1]==maxK ||
            nums[0]==maxK&&nums[1]==minK) {
                return 1;
            }
            return 0;
        }
        int subarrays = 0;
        int invalidcount = 0;
        boolean minPres = false;
        boolean maxPres = false;
        int fpoint = 1;
        int bpoint = 0;
        if (nums[fpoint]==minK) {
            minPres=true;
        } else if(nums[fpoint]==maxK) {
            maxPres = true;
        } else if (nums[fpoint]>maxK||nums[fpoint]<minK) {
            invalidcount++;
        }
        if (nums[bpoint]==minK) {
            minPres=true;
        } else if(nums[bpoint]==maxK) {
            maxPres = true;
        } else if (nums[bpoint]>maxK||nums[bpoint]<minK) {
            invalidcount++;
        }
        while(fpoint<nums.length&&bpoint<nums.length) {
            if(minPres&&maxPres&&invalidcount==0) {
                while(invalidcount==0) {
                    fpoint++;
                    if(nums[fpoint]>maxK||nums[fpoint]<minK) {
                        invalidcount++;
                    } else {
                        subarrays++;
                    }
                }
            }
        }
        return 0;
    }
}
