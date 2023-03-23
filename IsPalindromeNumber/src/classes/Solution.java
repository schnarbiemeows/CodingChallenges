package classes;

/*
 * 1:02 - 1:16 = 14 minutes
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        if(x%10==0) return false;
        int temp = x;
        // problem is, what if it ends in zeroes? the reverse has to start with zeros - BUT
        // the number won't begin with zeros, so thats good
        // problem the input has to be 32-bits or less, but the reverse could be more than that
        StringBuilder sb = new StringBuilder("");
        while(temp>0) {
            sb.append(temp%10+"");
            temp = temp/10;
        }
        String numStr = x+"";
        String result = sb.toString();
        if(numStr.equals(result)) {
            return true;
        }
        return false;
    }
}
