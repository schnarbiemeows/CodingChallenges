package classes;

/*
 * 11:25 - 11:50 = 25 minutes, but I had to submit twice
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */
public class Solution {
    /**
     * theres at least 1 item
     * an item could be just ""
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String longest = strs[0];
        if(longest.equals("")) return "";
        String nextLongest = "";
        for(int i=1;i<strs.length; i++) {
            String item = strs[i];
            if(item.equals("")) return "";
            if(item.charAt(0)!=longest.charAt(0)) {
                return "";
            } else {
                nextLongest += item.charAt(0);
                //item = item.replaceFirst(nextLongest,"");
            }
            int index = 1;
            while(index<item.length()&&index<longest.length()) {
                if(item.charAt(index)!=longest.charAt(index)) {
                    break;
                } else {
                    nextLongest += item.charAt(index);
                    //item = item.replaceFirst(nextLongest,"");
                }
                index++;
            }
            longest = nextLongest;
            nextLongest = "";
        }
        return longest;
    }
}
