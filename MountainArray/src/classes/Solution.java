package classes;

/*
 * 6:47 - 7:06
 * wrong
 * 7:09 - ACCEPTED, so 22 minutes
 *  runtime = 7.68%, memory = 46.31%
 *  nums are positive
 * numbers have to always be increasing or decreasing, no equals
 */
public class Solution {

    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int max = -1;
        int maxindex = -1;
        boolean maxFound=false;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max&&maxFound==false) { // going up, first item will always be this
                if(i==arr.length-1) {   // if the max is the last item
                    System.out.println("crash after i = " + i + " num = " + arr[i]);
                    return false;
                }
                maxindex=i;
                max = arr[i];
            } else if(arr[i]==max) {
                System.out.println("crash after i = " + i + " num = " + arr[i]);
                return false; // staying level
            } else if(arr[i]<arr[i-1]) {    // going down, has to have found a max, with index>0, and then each one is less than one before it
                if(!maxFound) {
                    maxFound = true;
                }
                    if(i==1) {
                        System.out.println("crash after i = " + i + " num = " + arr[i]);
                        return false;   // if the first item was the max
                    }

            } else {
                System.out.println("crash after i = " + i + " num = " + arr[i]);
                return false;   // here it is going back up after it has found a max already, which is why it didn't land in first clause
            }
        }
        return true;
    }
}
