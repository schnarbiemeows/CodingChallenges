package main;

import classes.Solution2;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2,2,2,3};
        Solution2 sol = new Solution2();
        arr = sol.sortArrayByParity(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
