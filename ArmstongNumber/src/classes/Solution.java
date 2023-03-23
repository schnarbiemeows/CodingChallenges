package classes;

/*
 * start time = 7:54
 * end time = 8:00
 * total time =  6 minutes
 * speed = 12.92 %
 * memory = 38.38 %
 * notes:
 * slow
 */
public class Solution {
    public boolean isArmstrong(int n) {
        int total = 0;
        String s = n+"";
        for(int i=0;i<s.length();i++) {
            total += Math.pow(Integer.valueOf(s.charAt(i)+""),s.length());
        }
        if(total==n) return true;
        return false;
    }
}
