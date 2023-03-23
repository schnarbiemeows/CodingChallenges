package classes;

public class Solution2 {

    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        if(x%10==0) return false;
        String numStr = x+"";
        for(int i=0;i<=numStr.length()/2;i++) {
            if(numStr.charAt(i)!=numStr.charAt(numStr.length()-i-1)) return false;
        }
        return true;
    }
}
