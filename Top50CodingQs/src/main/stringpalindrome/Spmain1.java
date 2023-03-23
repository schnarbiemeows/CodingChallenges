package main.stringpalindrome;

import java.util.Locale;

/**
 * 6:37 - 6:41
 * 6:41 - 6:45 recursive solution
 */
public class Spmain1 {
    public static void main(String[] args) {
        String str = "";
        System.out.println(str + " is p? = " + isPalindrome(str));
        System.out.println(str + " is p? = " + isPal(str));
    }

    public static boolean isPalindrome(String str) {
        if(str==null||str.isEmpty()) return false;
        if(str.length()==1) return true;
        char[] chars = str.toLowerCase().toCharArray();
        int i = chars.length/2;
        for(int j=0; j<i;j++) {
            if(chars[j]!=chars[chars.length-j-1]) return false;
        }
        return true;
    }

    public static boolean isPal(String str) {
        if(str==null||str.isEmpty()) return false;
        if(str.length()==1) return true;
        char[] chars = str.toLowerCase().toCharArray();
        return isP(chars, 0);
    }

    private static boolean isP(char[] chars, int i) {
        if(i==chars.length/2) {
            return true;
        }
        else if(chars[i]!=chars[chars.length-i-1]) {
            return false;
        }
        else {
            return isP(chars,i+1);
        }
    }
}
