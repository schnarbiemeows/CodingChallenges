package classes;

public class Solution2 {

    public String longestCommonPrefix(String[] strs) {
        // this first prt finds the shortest string and sets that to s
        int min = strs[0].length();
        String s=strs[0];
        for(String x:strs)
        {
            if(x.length()<min)
            {
                min=x.length();
                s=x;
            }
        }
        // this second part, c = how many of the strings in the array start with s
        // where s is a smaller and smaller subset of the original s
        // once it finds the substring that all the strings start with, return that
        int c=0;
        for(int k=s.length();k>=1;k--)
        {
            for(String x:strs)
            {
                if(x.startsWith(s.substring(0,k)))
                    c++;
            }
            if(c==strs.length) {
                return s.substring(0,k);
            }
            c=0;
        }
        return "";
    }
}
