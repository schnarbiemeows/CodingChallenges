package main;

public class Solution2 {
    public boolean isValid(String s) {
        int openA = 0;
        int openB = 0;
        int openC = 0;
        if(s.length()<2) return false;
        char[] chars = s.toCharArray();
        int lastIndex = -1;
        int prevIndex = -1;
        for(int i=0;i<chars.length;i++) {
            switch(chars[i]) {
                case '(': openA++; prevIndex = lastIndex; lastIndex = i; break;
                case ')': if(openA==0) {
                    return false;
                } else {
                    if(chars[lastIndex]!='(') return false;
                    openA--;
                    lastIndex--;
                    break;
                }
                case '{': openB++; prevIndex = lastIndex; lastIndex = i; break;
                case '}': if(openB==0) {
                    return false;
                } else {
                    if(chars[lastIndex]!='{') return false;
                    openB--;
                    lastIndex--;
                    break;
                }
                case '[': openC++; lastIndex = i; break;
                case ']': if(openC==0) {
                    return false;
                } else {
                    if(chars[lastIndex]!='[') return false;
                    openC--;
                    lastIndex--;
                    break;
                }
            }
        }
        if(openA>0||openB>0||openC>0) return false;
        return true;
    }
}
