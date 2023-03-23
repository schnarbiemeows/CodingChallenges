package classes;

/*
 * 7:05 - 7:21 = 16 minutes
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int backEndIndex = m+n-1;
        int mindex = m-1;
        int nindex = n-1;
        while(mindex>=0) {
            int mvalue = nums1[mindex];
            while(nindex>=0&&nums2[nindex]>=mvalue) {
                nums1[backEndIndex] = nums2[nindex];
                backEndIndex--;
                nindex--;
            }
            nums1[backEndIndex]=nums1[mindex];
            mindex--;
            backEndIndex--;
        }
        while(nindex>=0) {
            nums1[backEndIndex] = nums2[nindex];
            backEndIndex--;
            nindex--;
        }
    }
}
