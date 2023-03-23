package classes;

/**
 * 4:32 - 4:46 = 14 minutes
 * speed = 92.34%
 * memory = 74.10%
 *
 */
public class Solution3 {
    public String longestCommonPrefix(String[] strs) {
        String word = "";
        int minlength = 201;
        for(int i=0;i<strs.length;i++) {
            if(strs[i].length()<minlength) {
                word = strs[i];
                minlength=word.length();
            }
        }
        if(word.isEmpty()) {
            return "";
        }
        for(int i=word.length();i>0;i--) {
            String subword = word.substring(0,i);
            boolean found = true;
            for(int j=0;j<strs.length;j++) {
                if(!strs[j].startsWith(subword)) {
                    found = false;
                }
            }
            if(found) {
                return subword;
            }
        }
        return "";
    }
}
