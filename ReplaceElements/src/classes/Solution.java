package classes;

/*
 * 6:27 - 6:47
 *
 * so we loop from the end except for the last element
 * compare each element with the max(cause that is already the max of al elements on the right)
 * finally, change the last elelment to -1
 * speed = 31.29%, space = 92.39%
 */
public class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length==1) {
            arr[0]=-1;
            return arr;
        }
        for(int i=0;i<=arr.length-2;i++) {
            int max = 0;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]>max) {
                    max = arr[j];
                    arr[i]=max;
                }
            }

        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
