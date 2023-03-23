package classes;

/*
 *  10:42 - 10:52
 * what did I fuck up on this one?
 * 1. did not read the problem correctly;
 * rats, no its not 2*0 = 0!
 */
public class Solution {

    public boolean checkIfExist(int[] arr) {
        if(arr.length==2) {
            if(arr[0]==2*arr[1]) return true;
            return false;
        }
        /**
         * for in a for loop O(n^2)
         * i goes from 0 to the length-2
         * j goes backwards from arr.length-1 to whatever i is +1
         */
        for(int i=0; i<arr.length-2;i++) {
            for(int j=arr.length-1;j>i;j--) {
                if((arr[i]==2*arr[j])||(arr[j]==2*arr[i])) {
                    System.out.println("numbers are: " + arr[i] + " at index " + i + " and " + arr[j] + " at index " + j);
                    return true;
                }
            }
        }
        return false;
    }
}
