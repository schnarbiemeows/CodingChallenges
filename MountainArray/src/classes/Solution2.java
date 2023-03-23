package classes;

/**
 * this is a 100%/100% solution, stusy it
 */
public class Solution2 {

    public boolean validMountainArray(int[] A) {
        if(A.length < 3) return false;

        int i = 0, j = 0;
        while(i < A.length-1 && A[i] < A[i+1]) i++;
        while(j+i < A.length-1 && A[j+i] > A[j+i+1]) j++;

        //    i > 0 (values actually increased)
        //    j > 0 (values actually decreased)
        //    i+j == A.length-1 (we actually reached the end of the array)
        return i > 0 && j > 0 && i+j == A.length-1;
    }
}
